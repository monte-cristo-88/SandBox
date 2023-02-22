package org.example.tooman;

public class Tooman {

    public static void main(String[] args) {
        Customer Temirlan = new Customer();
        Temirlan.isVisiting();


        Waiter waiter = new Waiter();
        waiter.bringMenu();
        Kalianshik kalianshik = new Kalianshik();
        kalianshik.bringKalian();
    }
}
