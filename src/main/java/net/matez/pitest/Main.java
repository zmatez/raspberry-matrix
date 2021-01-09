package net.matez.pitest;

import com.pi4j.io.gpio.*;
import net.matez.pitest.font.PixelFont;
import net.matez.pitest.log.Logger;
import net.matez.pitest.max.MatrixControl;
import net.matez.pitest.max.MatrixManager;
import net.matez.pitest.max.MaxUtil;
import net.matez.pitest.neopixel.NeoPixelUtil;

public class Main {
    public static final GpioController gpio = GpioFactory.getInstance();

    public static Logger LOGGER = new Logger();

    public static void main(String... args) {
        System.out.println("\n\n\n");
        LOGGER.success("Started");
        startNEOPIXEL();
        LOGGER.success("Finished");
    }

    public static void startMAX(){
        MaxUtil.main(gpio);
    }

    public static void startNEOPIXEL(){
        NeoPixelUtil.main(gpio);
    }

    public static void delay(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
