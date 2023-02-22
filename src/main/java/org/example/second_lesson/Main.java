package org.example.second_lesson;

import org.example.second_lesson.interfaces.InterfaceSample;
import org.example.second_lesson.interfaces.NamePrinter;
import org.example.second_lesson.interfaces.SimpleFunction;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static List<String> strings = Stream.of(
            "Yazim", "Danik", "Temir", "Kerim"
    ).collect(Collectors.toList());
    public static void main(String[] args) {
//        threads();
        changeSet();
    }


    static void threads() {
        new Thread(() -> {
        }).start();
//
//
//        InterfaceSample lambda = () -> {};

        NamePrinter namePrinter = name -> {
            System.out.println(name);
        };

        namePrinter.printName("Danik");

    }

    // исходный текст ;исходный текст ;
    // исходный текст; исходный текст;
    static void changeSet() {
        List<SimpleFunction> changes = Stream.of(
                        string -> string+ ";",
                        string -> string + " ",
                        string -> string + string,
                        (SimpleFunction) string -> string + " "
                )
                .collect(Collectors.toList());

        String text = "исходный текст";

        for (SimpleFunction change : changes) {
            text = change.doChange(text);
        }

        System.out.println(text);
    }

    static void streamExample() {
        strings.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
    }

    static void toStringInAll() {
        strings.toString();
    }


    static int returnInt() {
        return 5;
    }

    static String returnString() {
        return "";
    }

    static void intInteger() {

//        boolean aBoolean = true;
        Boolean aBoolean = true;

//        short anShort = 5;
        Short anShort = 5;

//        int anInt = Integer.MAX_VALUE;
        Integer anInt = Integer.MAX_VALUE;

//        long anLong = 5;
        Long anLong = 5L;

//        float anFloat = 5.3f;
        Float anFloat = 5.3f;

//        double anDouble = 5.5;
        Double anDouble = 5.5;

//        char aChar = 'k';
        Character aChar = 'k';
    }
}
