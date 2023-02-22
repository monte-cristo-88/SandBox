package org.example.second_lesson.task;

public class LearnString {
    static String text = "Danik";
    public static void main(String[] args) {
//        one();
//        two();
//        three();
//        four();
//        five();
//        six();
        seven();
    }

    private static void seven() {
        System.out.println(text.substring(1));
    }

    private static void six() {
        System.out.println(text.hashCode());
    }

    static void one() {
        System.out.println(text.toUpperCase());
    }

    static void two() {
        System.out.println(text.toString());
    }

    static void three() {
        System.out.println(text.length());
    }
    static void four(){
        System.out.println(text.getBytes());

    }
    static void five(){System.out.println(text.toLowerCase());}



}
