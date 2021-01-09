package net.matez.pitest.neopixel;

import com.diozero.ws281xj.LedDriverInterface;
import com.diozero.ws281xj.PixelAnimations;
import com.diozero.ws281xj.PixelColour;
import com.diozero.ws281xj.rpiws281x.WS281x;
import com.pi4j.io.gpio.*;
import net.matez.pitest.Main;

import java.awt.*;

public class NeoPixelControl {
    private final int ledCount;
    private final int rows, columns;

    private final LedDriverInterface ledInterface;
    public NeoPixelControl(int gpioPin, int brightness, int ledCount){
        this.ledCount = ledCount;
        this.rows = (int)Math.sqrt(ledCount);
        this.columns = (int)Math.sqrt(ledCount);

        ledInterface = new WS281x(gpioPin,brightness,ledCount);
    }

    public LedDriverInterface getLedInterface() {
        return ledInterface;
    }

    public void clear(){
        fill(0,0,0);
    }

    public void fill(int r, int g, int b){
        for(int i = 0; i < ledCount; i++){
            ledInterface.setPixelColourRGB(i,r,g,b);
        }
        ledInterface.render();
    }

    public void fill(Color color){
        this.fill(color.getRed(),color.getGreen(),color.getBlue());
    }

    public void fillRow(int row, int r, int g, int b){
        for(int i = 0; i < columns; i++){
            setPixelColor((row * rows) + i, r, g, b);
        }
    }

    public void fillRow(int row, Color color){
        this.fillRow(row,color.getRed(),color.getGreen(),color.getBlue());
    }

    public void animationSmoothPixel(int pixel, int r, int g, int b, int ms){
        int color = ledInterface.getPixelColour(pixel);
        Color c = new Color(color);
        int or = c.getRed();
        int og = c.getGreen();
        int ob = c.getBlue();

        int dr = Math.max(or,r) - Math.min(or,r);
        int dg = Math.max(og,g) - Math.min(og,g);
        int db = Math.max(ob,b) - Math.min(ob,b);

        for(int i = 0; i < dr; i++){
            for(int j = 0; j < dg; j++){
                for(int k = 0; k < db; k++){
                    int nr = or;
                    int ng = og;
                    int nb = ob;
                    if(or > r){
                        nr -= i;
                    }else{
                        nr += i;
                    }

                    if(og > g){
                        ng -= j;
                    }else{
                        ng += j;
                    }

                    if(ob > b){
                        nb -= k;
                    }else{
                        nb += k;
                    }

                    setPixelColor(pixel,nr,nb,ng);
                    Main.delay(ms);
                }
            }
        }
    }

    public void animationFillCenter(int waveMs){
        int startNumber = ledCount % 2 == 0 ? 2 : 1;

    }

    public void setPixelColor(int pixel, int r, int g, int b){
        ledInterface.setPixelColourRGB(pixel,r,g,b);
        ledInterface.render();
    }

    public void setPixelColor(int pixel, Color color){
        this.setPixelColor(pixel,color.getRed(),color.getGreen(),color.getBlue());
    }



    public void theatreChase(int c, int wait) {
        for (int j=0; j<10; j++) {  //do 10 cycles of chasing
            for (int q=0; q < 3; q++) {
                for (int i=0; i < ledInterface.getNumPixels(); i+=3) {
                    if(i + q < ledInterface.getNumPixels()) {
                        ledInterface.setPixelColour(i + q, c);    //turn every third pixel on
                    }
                }
                ledInterface.render();

                PixelAnimations.delay(wait);

                for (int i=0; i < ledInterface.getNumPixels(); i+=3) {
                    if(i + q < ledInterface.getNumPixels()) {
                        ledInterface.setPixelColour(i + q, 0);        //turn every third pixel off
                    }
                }
            }
        }
    }

    /* Theatre-style crawling lights with rainbow effect */
    public void theatreChaseRainbow(int wait) {
        for (int j=0; j < 256; j++) {     // cycle all 256 colours in the wheel
            for (int q=0; q < 3; q++) {
                for (int i=0; i < ledInterface.getNumPixels(); i=i+3) {
                    if(i + q < ledInterface.getNumPixels()) {
                        ledInterface.setPixelColour(i + q, PixelColour.wheel((i + j) % 255));    //turn every third pixel on
                    }
                }
                ledInterface.render();

                PixelAnimations.delay(wait);

                for (int i=0; i < ledInterface.getNumPixels(); i=i+3) {
                    if(i + q < ledInterface.getNumPixels()) {
                        ledInterface.setPixelColour(i + q, 0);        //turn every third pixel off
                    }
                }
            }
        }
    }
}
