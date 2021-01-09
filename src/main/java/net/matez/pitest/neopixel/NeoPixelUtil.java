package net.matez.pitest.neopixel;

import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.PixelColour;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.RaspiPin;
import net.matez.pitest.Main;
import net.matez.pitest.util.Utilities;

import java.awt.*;

public class NeoPixelUtil {
    public static NeoPixelControl control;

    public static void main(GpioController gpio){
        Main.LOGGER.log("Neopixel start");
        control = new NeoPixelControl(18,255,64);
        control.clear();
        Main.delay(250);

        //PixelAnimations.colourWipe(control.getLedInterface(), PixelColour.createColourRGB(255,10,200), 5);
        control.theatreChaseRainbow(20);
    }
}
