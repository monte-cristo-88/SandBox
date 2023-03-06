package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {4, 5, 3, 4, 7, 5, 3, 23, 4234};

        int sum = 0;
        System.out.println("Sum in the begining = " + sum);
        for (int anInt : intArray) {
            sum = sum + anInt;
        }
        System.out.println("Sum in the end = " + sum);


//        Kalian firstKalian = new Kalian();
//        firstKalian.smoke();
//        firstKalian.aMethod();
//
//        new Kalian().smoke();
//        new Kalian().aMethod();

//hgvfc
        boolean aBoolean = true;

        short anShort = 5;
        int anInt = Integer.MAX_VALUE;
        long anLong = 5;
        float anFloat = 5.3f;
        double anDouble = 5.5;
        char aChar = 'k';
//
        String text = "asdasdij asdoiansdanr weoifnw efnlw";
        char[] chars = text.toCharArray();
        System.out.println(text);

        Хуйня хуйня = new Хуйня();
    }
}