package net.matez.pitest.max;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.RaspiPin;
import net.matez.pitest.font.PixelFont;

public class MaxUtil {
    public static MatrixControl control;
    public static MatrixManager manager;
    public static void main(GpioController gpio){
        PixelFont.registerAll();
        control = new MatrixControl(gpio, RaspiPin.GPIO_12,RaspiPin.GPIO_14,RaspiPin.GPIO_10,8,8);
        control.start();
        control.setIntensity(5);

        control.clear();

        manager = new MatrixManager(control);
        manager.showText("JANUSZ GRZYB TANCZY WALCA",10);

        while(true){

        }
    }
}
