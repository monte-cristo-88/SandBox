package org.example.modifiers;

public class Private {
    private int someInt;

    private void privateMethod() {
        someMethod();
    }

    private void someMethod() {
        privateMethod();
    }

    private static class PrivateInnerClass {

    }
}
