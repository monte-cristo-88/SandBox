package org.example;

public class IntBug {
    public static void main(String[] args) {
        short maxShort = Short.MAX_VALUE;
        System.out.println("Max value of short = " + maxShort);
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max value of int = " + maxInt);
        long maxLong = Long.MAX_VALUE;
        System.out.println("Max value of long = " + maxLong);

        int maxIntPlusOne = maxInt + 1;
        System.out.println("Max value of int + 1 = " + maxIntPlusOne);
        long maxLongPlusOne = maxLong + 1;
        System.out.println("Max value of long + 1 = " + maxLongPlusOne);
    }
}
