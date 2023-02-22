package org.example;

public class vector {
    public static void main( String[] args) {
        couch Kerim = new couch();
        Kerim.givetask();

        koordinator Koluchka = new koordinator();
        Koluchka.givetask();

        said("Kerim","turn off your head");


    }
    static void said(String name, String quote) {
        System.out.println(name+" said:"+quote);
    }
}
