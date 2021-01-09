package net.matez.pitest.max;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import net.matez.pitest.Main;

public class MatrixControl {
    private final GpioController gpio;

    private final int DECODE_MODE = 0x09;
    private final int INTENSITY = 0x0a;
    private final int SCAN_LIMIT = 0x0b;
    private final int SHUTDOWN = 0x0c;
    private final int DISPLAY_TEST = 0x0f;

    private final Pin data, clock, load;
    private final GpioPinDigitalOutput dataPin, clockPin, loadPin;

    private final int width, height;
    private final int[][] matrices;

    public MatrixControl(GpioController gpio, Pin data, Pin clock, Pin load, int width, int height) {
        this.gpio = gpio;
        this.data = data;
        this.clock = clock;
        this.load = load;

        this.width = width;
        this.height = height;
        this.matrices = new int[width][height];

        this.dataPin = gpio.provisionDigitalOutputPin(data, "DATA");
        this.clockPin = gpio.provisionDigitalOutputPin(clock, "CLOCK");
        this.loadPin = gpio.provisionDigitalOutputPin(load, "LOAD");

        max7219Send(SCAN_LIMIT, 7);
        max7219Send(DECODE_MODE, 0);
        max7219Send(DISPLAY_TEST, 0);
        Main.LOGGER.success("Initialized MatrixControl: data: " + data.getAddress() + ", clock: " + clock.getAddress() + ", load: " + load.getAddress());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void start() {
        max7219Send(SHUTDOWN, 1);
    }

    public void stop() {
        max7219Send(SHUTDOWN, 0);
    }

    public void append(int x, int y, boolean powered) {
        matrices[x][y] = powered ? 1 : 0;
        render();
    }

    public void clear() {
        fill(0);
    }

    public void fill(int val) {
        for(int x = 0; x < width; x++){
            for(int y = 0; y < height; y++){
                matrices[x][y] = val;
            }
        }
        render();
    }

    public void render(){
        for(int x = 0; x < width; x++){
            int[] columns = matrices[x];
            int column = 0;
            for(int y = 0; y < height; y++){
                if(columns[y] > 0) {
                    column |= (int) Math.pow(2, y);
                }
            }
            max7219Send(x + 1, column);
        }
    }

    /**
     * min = 0 - dark, max = 15 - super bright
     *
     * @param intensity
     */
    public void setIntensity(int intensity) {
        max7219Send(INTENSITY, Math.max(Math.min(intensity, 15), 0));
    }


    //Util
    private void send16bits(int output) {
        char i;
        for (i = 16; i > 0; i--) {
            int mask = 1 << (i - 1); // calculate bitmask

            clockPin.low();  // set clock to 0

            // Send one bit on the data pin
            if ((output & mask) != 0) {
                dataPin.high();
            } else {
                dataPin.low();
            }

            clockPin.high();
        }
    }


    // Take a reg numer and data and send to the max7219
    private void max7219Send(int reg_number, int dataout) {
        loadPin.high();  // set LOAD 1 to start
        send16bits((reg_number << 8) + dataout);   // send 16 bits ( reg number + dataout )
        loadPin.low();  // LOAD 0 to latch
        loadPin.high();  // set LOAD 1 to finish
    }

    private void max7219Send(char reg_number, int dataout) {
        Main.LOGGER.debug("Sending R: " + reg_number + " D: " + dataout);
        loadPin.high();  // set LOAD 1 to start
        send16bits((reg_number << 8) + dataout);   // send 16 bits ( reg number + dataout )
        loadPin.low();  // LOAD 0 to latch
        loadPin.high();  // set LOAD 1 to finish
    }

}
