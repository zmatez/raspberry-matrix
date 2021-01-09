package net.matez.pitest.util;

import java.util.Random;

public class Utilities {
    public static int rint(int min, int max) {
        if (min == max) {
            return min;
        }

        if (min >= max) {
            return max;
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
