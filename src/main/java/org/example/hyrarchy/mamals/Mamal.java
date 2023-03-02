package org.example.hyrarchy.mamals;

public interface Mamal {
    int daiKolizhestvoSoskov();

    default int daiKolichestvoKonechnostei() {
        return 4;
    }
}
