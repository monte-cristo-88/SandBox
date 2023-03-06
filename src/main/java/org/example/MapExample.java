package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        Map<String, Peson> people = new HashMap<>();

        people.put("Temirlan", new Peson());
        people.put("Danik", new Peson());
        people.put("Beka", new Peson());
        people.put("Zhanbo", new Peson());

        Map<String, List<Integer>> classRoomJournal = new HashMap<>();

        List<Integer> оценкиТемирлана = new ArrayList<>();
        оценкиТемирлана.add(5);
        оценкиТемирлана.add(5);
        оценкиТемирлана.add(5);
        оценкиТемирлана.add(5);

        classRoomJournal.put("Konuspayev", оценкиТемирлана);

        List<Integer> оценкиДаник = new ArrayList<>();
        оценкиДаник.add(4);
        оценкиДаник.add(5);
        оценкиДаник.add(4);
        оценкиДаник.add(5);
        classRoomJournal.put("Aitmukhanbet", оценкиДаник);

        List<Integer> оценкиГалым = new ArrayList<>();
        оценкиГалым.add(3);
        оценкиГалым.add(3);
        оценкиГалым.add(3);
        оценкиГалым.add(3);

        classRoomJournal.put("Kariev", оценкиГалым);

        System.out.println();

        Map<Map<Map<Integer, String>, List<String>>, Integer> qwdawd = new HashMap<>();
        Map<Map<Integer, String>, List<String>> asd = new HashMap<>();
        Map<Integer, String> asdw = new HashMap<>();
        List<String> dqwdq = new ArrayList<>();
        asd.put(asdw, dqwdq);
        qwdawd.put(asd, 5);

        System.out.println();
    }
}
