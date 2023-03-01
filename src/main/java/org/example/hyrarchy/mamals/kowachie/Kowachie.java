package org.example.hyrarchy.mamals.kowachie;

import org.example.hyrarchy.mamals.Mamal;

public abstract class Kowachie implements Mamal {
    boolean imeetUsi() {
        return true;
    }

    abstract float sredniiVes();

    @Override
    public int daiKolizhestvoSoskov() {
        return 8;
    }
}
