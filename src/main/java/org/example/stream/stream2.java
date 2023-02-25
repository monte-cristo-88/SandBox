package org.example.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class stream2 {
    public static void main(String[] args) {
        String[] munsters = { "Herman", "Lily", "Eddie", "Marylin", "Grandpa"};
        String names = Arrays.stream(munsters)
                .collect(Collectors.joining(","));
        System.out.println(names);
//

    }
}
