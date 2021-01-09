package net.matez.pitest.font;

import java.util.LinkedHashMap;

public class PixelFont {
    public static final LinkedHashMap<Character, PixelFontChar> REGISTRY = new LinkedHashMap<>();

    public static final PixelFontChar UNKNOWN = new PixelFontChar('.',4,7, (maker, w, h) -> {
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(0,0);
        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);
        maker.makePixel(0,4);
        maker.makePixel(0,5);
        maker.makePixel(0,6);

        maker.makePixel(1,0);
        maker.makePixel(2,0);

        maker.makePixel(1,2);
        maker.makePixel(2,2);

        maker.makePixel(1,4);
        maker.makePixel(2,4);

        maker.makePixel(1,6);
        maker.makePixel(2,6);
    });

    public static final PixelFontChar NUMBER_0 = new PixelFontChar('0',4,7, (maker, w, h) -> {
        maker.makePixel(1,0);
        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);
        maker.makePixel(0,4);
        maker.makePixel(0,5);
        maker.makePixel(1,6);

        maker.makePixel(2,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(2,6);
    });

    public static final PixelFontChar NUMBER_1 = new PixelFontChar('1',3,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(1, 1);
        maker.makePixel(2, 0);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(2, 5);
        maker.makePixel(2, 6);
    });

    public static final PixelFontChar NUMBER_2 = new PixelFontChar('2',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar NUMBER_3 = new PixelFontChar('3',4,7, (maker, w, h) -> {
        
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(0,0);
        maker.makePixel(1,0);
        maker.makePixel(2,0);

        maker.makePixel(0,3);
        maker.makePixel(1,3);
        maker.makePixel(2,3);

        maker.makePixel(0,6);
        maker.makePixel(1,6);
        maker.makePixel(2,6);
         
    });

    public static final PixelFontChar NUMBER_4 = new PixelFontChar('4',4,7, (maker, w, h) -> {
        
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(0,0);
        maker.makePixel(0,1);
        maker.makePixel(0,2);

        maker.makePixel(0,3);
        maker.makePixel(1,3);
        maker.makePixel(2,3);
         
    });

    public static final PixelFontChar NUMBER_5 = new PixelFontChar('5',4,7, (maker, w, h) -> {
        
        maker.makePixel(0,0);
        maker.makePixel(1,0);
        maker.makePixel(2,0);
        maker.makePixel(3,0);

        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);

        maker.makePixel(1,3);
        maker.makePixel(2,3);
        maker.makePixel(3,3);

        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(2,6);
        maker.makePixel(1,6);
        maker.makePixel(0,6);
         
    });

    public static final PixelFontChar NUMBER_6 = new PixelFontChar('6',4,7, (maker, w, h) -> {
        
        maker.makePixel(0,0);
        maker.makePixel(1,0);
        maker.makePixel(2,0);
        maker.makePixel(3,0);

        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);

        maker.makePixel(1,3);
        maker.makePixel(2,3);
        maker.makePixel(3,3);

        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(2,6);
        maker.makePixel(1,6);
        maker.makePixel(0,6);

        maker.makePixel(0,5);
        maker.makePixel(0,4);
         
    });

    public static final PixelFontChar NUMBER_7 = new PixelFontChar('7',4,7, (maker, w, h) -> {
        
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(2,0);
        maker.makePixel(1,0);
        maker.makePixel(0,0);

        maker.makePixel(2,3);
        maker.makePixel(1,3);
         
    });

    public static final PixelFontChar NUMBER_8 = new PixelFontChar('8',4,7, (maker, w, h) -> {
        
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(0,0);
        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);
        maker.makePixel(0,4);
        maker.makePixel(0,5);
        maker.makePixel(0,6);

        maker.makePixel(1,0);
        maker.makePixel(2,0);

        maker.makePixel(1,3);
        maker.makePixel(2,3);

        maker.makePixel(1,6);
        maker.makePixel(2,6);
         
    });

    public static final PixelFontChar NUMBER_9 = new PixelFontChar('9',4,7, (maker, w, h) -> {
        
        maker.makePixel(3,0);
        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);
        maker.makePixel(3,4);
        maker.makePixel(3,5);
        maker.makePixel(3,6);

        maker.makePixel(0,0);
        maker.makePixel(0,1);
        maker.makePixel(0,2);
        maker.makePixel(0,3);
        maker.makePixel(0,6);

        maker.makePixel(1,0);
        maker.makePixel(2,0);

        maker.makePixel(1,3);
        maker.makePixel(2,3);

        maker.makePixel(1,6);
        maker.makePixel(2,6);
         
    });

    //SYMBOLS

    public static final PixelFontChar SPACE = new PixelFontChar(' ',3,7, (maker, w, h) -> {

    });

    public static final PixelFontChar SYMBOL_COLON = new PixelFontChar(':',1,7, (maker, w, h) -> {
        maker.makePixel(0,2);
        maker.makePixel(0,4);
    });

    public static final PixelFontChar SYMBOL_DOT = new PixelFontChar('.',1,7, (maker, w, h) -> {
        maker.makePixel(0,6);
    });

    public static final PixelFontChar SYMBOL_LEFT_BRACKET = new PixelFontChar('(',2,7, (maker, w, h) -> {
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
    });

    public static final PixelFontChar SYMBOL_RIGHT_BRACKET = new PixelFontChar(')',2,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
    });

    public static final PixelFontChar SYMBOL_SQUARE_LEFT_BRACKET = new PixelFontChar('[',2,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
    });

    public static final PixelFontChar SYMBOL_SQUARE_RIGHT_BRACKET = new PixelFontChar(']',2,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(1, 6);
    });

    public static final PixelFontChar SYMBOL_LEFT_CURLY_BRACKET = new PixelFontChar('{',3,7, (maker, w, h) -> {
        maker.makePixel(0, 3);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 0);
        maker.makePixel(2, 6);
    });

    public static final PixelFontChar SYMBOL_RIGHT_CURLY_BRACKET = new PixelFontChar('}',3,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_LEFT_SHARP_BRACKET = new PixelFontChar('<',3,7, (maker, w, h) -> {
        maker.makePixel(0, 3);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(2, 1);
        maker.makePixel(2, 5);
    });

    public static final PixelFontChar SYMBOL_RIGHT_SHARP_BRACKET = new PixelFontChar('>',3,7, (maker, w, h) -> {
        maker.makePixel(0, 1);
        maker.makePixel(0, 5);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_QUESTION_MARK = new PixelFontChar('?',3,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(2, 0);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_EXCLAMATION_MARK = new PixelFontChar('!',3,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_COMMA = new PixelFontChar(',',3,8, (maker, w, h) -> {
        maker.makePixel(1, 6);
        maker.makePixel(2, 7);
    });

    public static final PixelFontChar SYMBOL_SEMICOLON = new PixelFontChar(';',2,7, (maker, w, h) -> {
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
    });

    public static final PixelFontChar SYMBOL_MINUS = new PixelFontChar('-',3,7, (maker, w, h) -> {
        maker.makePixel(0, 3);
        maker.makePixel(1, 3);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_PLUS = new PixelFontChar('+',3,7, (maker, w, h) -> {
        maker.makePixel(0, 3);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(2, 3);
    });

    public static final PixelFontChar SYMBOL_EQUALS = new PixelFontChar('=',3,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(0, 4);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(2, 2);
        maker.makePixel(2, 4);
    });

    public static final PixelFontChar SYMBOL_AT = new PixelFontChar('@',6,7, (maker, w, h) -> {
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 2);
        maker.makePixel(3, 6);
        maker.makePixel(4, 0);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
        maker.makePixel(5, 1);
        maker.makePixel(5, 4);
    });

    public static final PixelFontChar SYMBOL_HASH = new PixelFontChar('#',5,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(0, 4);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(1, 6);
        maker.makePixel(2, 2);
        maker.makePixel(2, 4);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
        maker.makePixel(4, 2);
        maker.makePixel(4, 4);
    });

    public static final PixelFontChar SYMBOL_DOLLAR = new PixelFontChar('$',3,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(0, 5);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 3);
        maker.makePixel(1, 5);
        maker.makePixel(1, 6);
        maker.makePixel(2, 1);
        maker.makePixel(2, 4);
    });

    public static final PixelFontChar SYMBOL_PERCENT = new PixelFontChar('%',5,7, (maker, w, h) -> {
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 3);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
    });

    public static final PixelFontChar SYMBOL_CARET = new PixelFontChar('^',4,7, (maker, w, h) -> {
        maker.makePixel(1, 1);
        maker.makePixel(2, 0);
        maker.makePixel(3, 1);
    });

    //TODO & BAD
    public static final PixelFontChar SYMBOL_AND = new PixelFontChar('&',6,7, (maker, w, h) -> {
        maker.makePixel(0, 1);
        maker.makePixel(0, 5);
        maker.makePixel(1, 0);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(1, 6);
        maker.makePixel(2, 3);
        maker.makePixel(3, 0);
        maker.makePixel(3, 2);
        maker.makePixel(3, 4);
        maker.makePixel(3, 6);
        maker.makePixel(4, 1);
        maker.makePixel(4, 5);
        maker.makePixel(4, 6);
        maker.makePixel(5, 4);
    });

    public static final PixelFontChar SYMBOL_MULTIPLY = new PixelFontChar('*',3,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(0, 4);
        maker.makePixel(1, 3);
        maker.makePixel(2, 2);
        maker.makePixel(2, 4);
    });

    public static final PixelFontChar SYMBOL_PIPE = new PixelFontChar('|',2,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(1, 6);
    });

    public static final PixelFontChar SYMBOL_SLASH = new PixelFontChar('/',4,7, (maker, w, h) -> {
        maker.makePixel(0, 6);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(3, 0);
    });

    public static final PixelFontChar SYMBOL_BACKSLASH = new PixelFontChar('\\',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar SYMBOL_QUOTE = new PixelFontChar('"',4,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
    });

    public static final PixelFontChar SYMBOL_SINGLE_QUOTE = new PixelFontChar('\'',2,7, (maker, w, h) -> {
        maker.makePixel(0, 2);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
    });

    public static final PixelFontChar SYMBOL_TILDA = new PixelFontChar('~',5,7, (maker, w, h) -> {
        maker.makePixel(0, 3);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(4, 3);
    });

    //SYMBOLS END

    //LETTERS
    public static final PixelFontChar LETTER_A = new PixelFontChar('A',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 4);
        maker.makePixel(2, 0);
        maker.makePixel(2, 4);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_B = new PixelFontChar('B',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(2, 6);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
    });

    public static final PixelFontChar LETTER_C = new PixelFontChar('C',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_D = new PixelFontChar('D',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 6);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
    });

    public static final PixelFontChar LETTER_E = new PixelFontChar('E',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 3);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_F = new PixelFontChar('F',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(3, 0);
    });

    public static final PixelFontChar LETTER_G = new PixelFontChar('G',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_H = new PixelFontChar('H',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 3);
        maker.makePixel(2, 3);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_I = new PixelFontChar('I',3,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 6);
    });

    public static final PixelFontChar LETTER_J = new PixelFontChar('J',3,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 5);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(2, 5);
        maker.makePixel(2, 6);
    });

    public static final PixelFontChar LETTER_K = new PixelFontChar('K',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 3);
        maker.makePixel(2, 2);
        maker.makePixel(2, 4);
        maker.makePixel(3, 1);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
        maker.makePixel(4, 6);
    });

    public static final PixelFontChar LETTER_L = new PixelFontChar('L',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 6);
        maker.makePixel(2, 6);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_M = new PixelFontChar('M',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(4, 0);
        maker.makePixel(4, 1);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
        maker.makePixel(4, 4);
        maker.makePixel(4, 5);
        maker.makePixel(4, 6);
    });

    public static final PixelFontChar LETTER_N = new PixelFontChar('N',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(2, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
        maker.makePixel(4, 1);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
        maker.makePixel(4, 4);
        maker.makePixel(4, 5);
        maker.makePixel(4, 6);
    });

    public static final PixelFontChar LETTER_O = new PixelFontChar('O',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_P = new PixelFontChar('P',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
    });

    public static final PixelFontChar LETTER_Q = new PixelFontChar('Q',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 4);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
        maker.makePixel(4, 5);
    });

    public static final PixelFontChar LETTER_R = new PixelFontChar('R',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(1, 4);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(2, 5);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_S = new PixelFontChar('S',4,7, (maker, w, h) -> {
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 6);
        maker.makePixel(1, 0);
        maker.makePixel(1, 3);
        maker.makePixel(1, 6);
        maker.makePixel(2, 0);
        maker.makePixel(2, 3);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
    });

    public static final PixelFontChar LETTER_T = new PixelFontChar('T',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(1, 0);
        maker.makePixel(2, 0);
        maker.makePixel(2, 1);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(2, 5);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(4, 0);
    });

    public static final PixelFontChar LETTER_U = new PixelFontChar('U',4,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 6);
        maker.makePixel(2, 6);
        maker.makePixel(3, 0);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 3);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(3, 6);
    });

    public static final PixelFontChar LETTER_V = new PixelFontChar('V',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 6);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
        maker.makePixel(4, 1);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
    });

    public static final PixelFontChar LETTER_W = new PixelFontChar('W',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(0, 4);
        maker.makePixel(0, 5);
        maker.makePixel(0, 6);
        maker.makePixel(1, 5);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
        maker.makePixel(4, 1);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
        maker.makePixel(4, 4);
        maker.makePixel(4, 5);
        maker.makePixel(4, 6);
    });

    public static final PixelFontChar LETTER_X = new PixelFontChar('X',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 6);
        maker.makePixel(1, 1);
        maker.makePixel(1, 2);
        maker.makePixel(1, 4);
        maker.makePixel(1, 5);
        maker.makePixel(2, 2);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(3, 1);
        maker.makePixel(3, 2);
        maker.makePixel(3, 4);
        maker.makePixel(3, 5);
        maker.makePixel(4, 0);
        maker.makePixel(4, 6);
    });

    public static final PixelFontChar LETTER_Y = new PixelFontChar('Y',5,7, (maker, w, h) -> {
        maker.makePixel(0, 0);
        maker.makePixel(0, 1);
        maker.makePixel(0, 2);
        maker.makePixel(0, 3);
        maker.makePixel(1, 3);
        maker.makePixel(2, 3);
        maker.makePixel(2, 4);
        maker.makePixel(2, 5);
        maker.makePixel(2, 6);
        maker.makePixel(3, 3);
        maker.makePixel(4, 0);
        maker.makePixel(4, 1);
        maker.makePixel(4, 2);
        maker.makePixel(4, 3);
    });

    public static final PixelFontChar LETTER_Z = new PixelFontChar('Z',4,7, (maker, w, h) -> {

        maker.makePixel(0,0);
        maker.makePixel(1,0);
        maker.makePixel(2,0);
        maker.makePixel(3,0);

        maker.makePixel(3,1);
        maker.makePixel(3,2);
        maker.makePixel(3,3);

        maker.makePixel(2,3);
        maker.makePixel(1,3);
        maker.makePixel(0,3);

        maker.makePixel(0,4);
        maker.makePixel(0,5);
        maker.makePixel(0,6);

        maker.makePixel(1,6);
        maker.makePixel(2,6);
        maker.makePixel(3,6);

    });


    //END LETTERS

    public static void registerAll(){
        register(SPACE);

        //NUMBERS
        register(NUMBER_0);
        register(NUMBER_1);
        register(NUMBER_2);
        register(NUMBER_3);
        register(NUMBER_4);
        register(NUMBER_5);
        register(NUMBER_6);
        register(NUMBER_7);
        register(NUMBER_8);
        register(NUMBER_9);

        //LETTERS
        register(LETTER_A);
        register(LETTER_B);
        register(LETTER_C);
        register(LETTER_D);
        register(LETTER_E);
        register(LETTER_F);
        register(LETTER_G);
        register(LETTER_H);
        register(LETTER_I);
        register(LETTER_J);
        register(LETTER_K);
        register(LETTER_L);
        register(LETTER_M);
        register(LETTER_N);
        register(LETTER_O);
        register(LETTER_P);
        register(LETTER_Q);
        register(LETTER_R);
        register(LETTER_S);
        register(LETTER_T);
        register(LETTER_U);
        register(LETTER_V);
        register(LETTER_W);
        register(LETTER_X);
        register(LETTER_Y);
        register(LETTER_Z);

        //SYMBOLS
        register(SYMBOL_COLON);
        register(SYMBOL_DOT);
        register(SYMBOL_LEFT_BRACKET);
        register(SYMBOL_RIGHT_BRACKET);
        register(SYMBOL_SQUARE_LEFT_BRACKET);
        register(SYMBOL_SQUARE_RIGHT_BRACKET);
        register(SYMBOL_LEFT_CURLY_BRACKET);
        register(SYMBOL_RIGHT_CURLY_BRACKET);
        register(SYMBOL_LEFT_SHARP_BRACKET);
        register(SYMBOL_RIGHT_SHARP_BRACKET);
        register(SYMBOL_QUESTION_MARK);
        register(SYMBOL_EXCLAMATION_MARK);
        register(SYMBOL_COMMA);
        register(SYMBOL_SEMICOLON);
        register(SYMBOL_MINUS);
        register(SYMBOL_PLUS);
        register(SYMBOL_EQUALS);
        register(SYMBOL_AT);
        register(SYMBOL_HASH);
        register(SYMBOL_DOLLAR);
        register(SYMBOL_PERCENT);
        register(SYMBOL_CARET);
        register(SYMBOL_AND);
        register(SYMBOL_MULTIPLY);
        register(SYMBOL_PIPE);
        register(SYMBOL_SLASH);
        register(SYMBOL_BACKSLASH);
        register(SYMBOL_QUOTE);
        register(SYMBOL_SINGLE_QUOTE);
        register(SYMBOL_TILDA);
    }

    private static void register(PixelFontChar pixelFontChar){
        REGISTRY.put(pixelFontChar.getCharacter(),pixelFontChar);
    }

    public static class PixelFontChar{
        private final char character;
        private final int[][] matrices;
        private final int width, height;
        public PixelFontChar(char character, int width, int height, IPixelFont font){
            this.character = character;
            matrices = new int[width][height];
            for(int x = 0; x < width; x++){
                for(int z = 0; z < height; z++){
                    matrices[x][z] = 0;
                }
            }
            this.width = width;
            this.height = height;

            font.make(this,width,height);
        }

        private void makePixel(int x, int y){
            matrices[x][y] = 1;
        }

        public char getCharacter() {
            return character;
        }

        public int[][] getMatrices() {
            return matrices;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }

    public static interface IPixelFont{
        public void make(PixelFontChar pixelFontChar, int width, int height);
    }
}
