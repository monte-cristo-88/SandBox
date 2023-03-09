package org.example;

import java.util.*;

public class Generics { //  обьявление класса Generics
    private final Map<Integer, String> infos = new HashMap<>(); /*  обьявление переменной 'infos' с типом Map<Integer, String>
                                                                    с присвоением значения 'new HashMap<>()'
                                                                    и 'new HashMap<>()' это вызов конструктора класса 'HashMap'*/


    public static void main(String[] args) {    /*  обьявления статичного метода main принимающий в параметре переменную
                                                    с название args и типом String[]    */

//        String aString = "";
//        boolean aBoolean = ";2" == ";2";
//        boolean aSecondBoolean = new String(";2") == new String(";2");
//        boolean aThirdBoolean = new String(";2").equals(new String(";2"));
//        System.out.println(aBoolean);
//        System.out.println(aSecondBoolean);

        Список список;  //  обьявление переменной список типа Список
        список = new Список();   // переменной список присваиваем значение вызывая конструкор класса Список

        список.добавить("sdfsdf");  /*  вызывfем метод 'добавить' принbмающий параметр типа String
                                                у переменной 'список' */

        Collection<Integer> collection = new ArrayList<>();  /* обьявление переменной типа Collection <Integer>
                                                                с названием collection присваиваем значение
                                                                класса ArrayList */
        List<Integer> list = new ArrayList<>(); /* обьявление перемнной типа List<Integer> с названием list
                                                    присваиваем значение класса ArrayList */
        List<Integer> longList = new ArrayList<>();

        list.add(1);    // вызываем метод add переменной list принимающий параметр типа Int
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
        someClasses.add(                                  /*   вызываем метод add переменной someClasses принимает
                                                               перменную типа SomeClass*/
                new SomeClass(1, 1)  //
        );
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
        System.out.println("Stack result " + stack.pop());  //
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

    static class Gen<E extends Collection, T, F, G, D, S, A> {
        void add(E e) {

        }

//        void asdas(List<? super Integer> aList) {
//
//        }
    }

}
