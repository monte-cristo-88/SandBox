package org.example.static_;

public class NonStatic {
    public int someInt;

    public NonStatic(int someInt) {
        this.someInt = someInt;
    }

    public void someMethod() {
        someInt = someInt + 5;
    }
}
