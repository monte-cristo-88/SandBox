package org.example.static_;

public class Static {

    //  это постоянное значение отношения радиуса к окружности
    public static float pi = 3.14159265F;

    public static int minimumPaymentForCashback = 300;
    public static int someInt = 5;

    public static void someMethod() {

    }

    public static float getAreaOfCircle(float radius) {
        return pi * radius * radius;
    }

    public static void cashBack(int paymentSum) {
        if (paymentSum > minimumPaymentForCashback) {
            addCashback(paymentSum);
        }
    }



    public static boolean notCashBack(int paymentSum) {
        return paymentSum <= minimumPaymentForCashback;
    }

    private static void addCashback(int paymentSum) {


    }
}
