package org.example;

import java.util.*;

public class Generics {
    private final Map<Integer, String> infos = new HashMap<>();

    public static void main(String[] args) {

//        String aString = "";
//        boolean aBoolean = ";2" == ";2";
//        boolean aSecondBoolean = new String(";2") == new String(";2");
//        boolean aThirdBoolean = new String(";2").equals(new String(";2"));
//        System.out.println(aBoolean);
//        System.out.println(aSecondBoolean);

        Collection<Integer> collection = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> longList = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(3);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(3);

        Set<SomeClass> someClasses = new HashSet<>();
        someClasses.add(new SomeClass(1, 1));
        someClasses.add(new SomeClass(1, 1));
        someClasses.add(new SomeClass(1, 1));
        someClasses.add(new SomeClass(1, 1));
        someClasses.add(new SomeClass(1, 1));

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack result " + stack.pop());
        System.out.println("Stack result " + stack.pop());
        System.out.println("Stack result " + stack.pop());
        System.out.println("Stack result " + stack.pop());
        System.out.println("\n\n\n");

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue result " + queue.poll());
        System.out.println("Queue result " + queue.poll());
        System.out.println("Queue result " + queue.poll());
        System.out.println("Queue result " + queue.poll());

        System.out.println(someClasses);
        System.out.println(list);

//        Gen<Collection> gen = new Gen<>();
//        gen.add(collection);
//        gen.add(list);
//        gen.add(new String());
//        gen.asdas(longList);
//        gen.asdas(new ArrayList<Object>());
//        gen.asdas(list);

    }

    static class Gen<E extends Collection, T,F,G,D,S,A> {
        void add(E e) {

        }

//        void asdas(List<? super Integer> aList) {
//
//        }
    }

}
