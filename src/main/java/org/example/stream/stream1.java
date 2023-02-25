package org.example.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
        String names = Stream.of("Danik", "Temir", "Wednesday", "Galym")
                .collect(Collectors.joining(","));
        System.out.println(names);
//
    }
}
