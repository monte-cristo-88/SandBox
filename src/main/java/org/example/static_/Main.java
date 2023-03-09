package org.example.static_;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        NonStatic nonStatic = new NonStatic(8);
        int someInt = nonStatic.someInt;
//        NonStatic.someInt;

        int someInt1 = Static.someInt;

        Collections.emptyList();
    }
}
