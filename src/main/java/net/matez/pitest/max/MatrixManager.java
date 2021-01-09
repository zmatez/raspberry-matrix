package net.matez.pitest.max;

import net.matez.pitest.font.PixelFont;

import javax.swing.*;
import java.util.ArrayList;

public class MatrixManager {
    private final MatrixControl control;
    private int scrollSpeed = 100, scrollWaitState, xOffset;
    private String renderedText = "";
    private Timer scrollTimer;

    private int[][] renderMatrices;
    public MatrixManager(MatrixControl control){
        this.control = control;
        initTimer();
    }

    private void initTimer(){
        scrollTimer = new Timer(10,(a) -> {
            if(scrollWaitState >= scrollSpeed){
                scrollWaitState = 0;
                render();
                if(renderMatrices != null) {
                    xOffset++;
                    if (xOffset >= renderMatrices.length) {
                        xOffset = -control.getWidth();
                    }
                }
            }
            scrollWaitState++;
        });
        scrollTimer.start();
    }

    private void render(){
        if(renderMatrices == null){
            return;
        }
        for(int x = 0; x < control.getWidth(); x++){
            for(int y = 0; y < control.getHeight(); y++){
                int rX = x + xOffset;
                if(rX < renderMatrices.length && rX >= 0) {
                    control.append(x, y, renderMatrices[rX][y] == 1);
                }
            }
        }
    }

    public void showText(String text){
        this.showText(text,100);
    }

    public void showText(String text, int speed){
        this.renderedText = text;
        this.scrollWaitState = 0;
        this.scrollSpeed = speed;

        renderMatrix();
    }

    private PixelFont.PixelFontChar[] getTextFont(){
        ArrayList<PixelFont.PixelFontChar> pixelFontCharArrayList = new ArrayList<>();
        for (char c : renderedText.toCharArray()) {
            PixelFont.PixelFontChar pixelFontChar = PixelFont.REGISTRY.get(c);
            if(pixelFontChar == null){
                pixelFontChar = PixelFont.UNKNOWN;
            }

            pixelFontCharArrayList.add(pixelFontChar);
        }
        return pixelFontCharArrayList.toArray(new PixelFont.PixelFontChar[0]);
    }

    private int getTextLength(PixelFont.PixelFontChar[] pixelFontChars){
        int length = 0;
        for (PixelFont.PixelFontChar pixelFontChar : pixelFontChars) {
            length += pixelFontChar.getWidth() + 1;
        }
        return length + control.getWidth();
    }

    private void renderMatrix(){
        PixelFont.PixelFontChar[] pixelFontChars = getTextFont();
        int length = getTextLength(pixelFontChars);

        renderMatrices = new int[length][control.getHeight()];


        // i means current X of renderMatrix, j means pixelFontChar
        for(int i = 0, j = 0; i < length && j < pixelFontChars.length; j++){
            PixelFont.PixelFontChar pixelFontChar = pixelFontChars[j];

            for(int x = 0; x < pixelFontChar.getWidth(); x++){
                for(int y = 0; y < pixelFontChar.getHeight(); y++){
                    int pixel = pixelFontChar.getMatrices()[x][y];

                    renderMatrices[x+i][y] = pixel;
                }
            }

            i += pixelFontChar.getWidth() + 1;
        }
    }
}
