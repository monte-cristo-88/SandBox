package org.example;

import java.util.*;

public class SomeTask {
    public static void main(String[] args) {
        mapExample();

    }

    static void listExample() {
        List<String> newList = new ArrayList<>();
        newList.add("Danik");
        newList.add("Temirlan");
        newList.add("Beka");
        newList.add("Galym");

        for (String name : newList) {
            System.out.println(name);
        }
    }

    public static void SetExample() {
        Set<String> newSet = new HashSet<>();
        newSet.add("Danik");
        newSet.add("Temirlan");
        newSet.add("Beka");
        newSet.add("Galym");
        for (String name : newSet) {
            System.out.println(name);
        }
    }

    public static void mapExample() {
        Map<String, Integer> map = new HashMap<>();

        map.put("Danik", 4);
        map.put("Temirlan",5);
        map.put("Beka", 2);
        map.put("Galym", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
