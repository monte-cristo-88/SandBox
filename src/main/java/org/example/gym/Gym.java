package org.example.gym;

public class Gym {
    public static void main(String[] args) {
        trainer Omar = new trainer();
        Omar.givetask();

        guest Temir = new guest();
        Temir.completetask();

        admin Galya = new admin();
        Galya.welcome();
    }
}
