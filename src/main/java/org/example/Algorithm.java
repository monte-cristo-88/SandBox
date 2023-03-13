package org.example;

public class Algorithm {   // обьявляем класс с названием Algoritm

     public static void main(String[] args) { // обьявляем публичный статичный метод main с аргументом args типа массив  String
        int[][] pattern = new int[5][5]; /* обьявляем переменную с названием pattern двумерного массива типа int
                                            вызываем конструктор двумерного массива типа int с размерностью 5*/

//        increament();

//        pattern = firstPattern(pattern);
//        pattern = secondPattern(pattern);
//        pattern = thirdPattern(pattern);
        pattern = fourthPattern(pattern);   /*   переменной pattern присваиваем значение результата вызова метода fourthPattern. передача
                                                 переменной pattern как аргумент */

        printArray(pattern); // вызываем  метода printArray. передача переменной  pattern как аргумент
    }

    private static int[][] fourthPattern(int[][] massiv) {  /* обьявляем приватный статичный метод fourthPattern
                                                              типа двумерного массива int. c аргументом massiv двумерного массива типа int*/



//        // все возможные значения raw = {0, 1, 2, 3, 4}
//        for (int row = 0;
//             row < massiv.length;
//             row++) {
//            // x + y = 0
//            // row + column
//            // все возможные значения выражение (row + 1) * 2 = {
//            // (0 + 1) * 2 = 2
//            // (1 + 1) * 2 = 4
//            // (2 + 1) * 2 = 6
//            // (3 + 1) * 2 = 8
//            // (4 + 1) * 2 = 10
//            // }
//            for (int column = massiv.length - 1;
//                 column >= 0;
//                 column--) {
//                massiv[row][column] = currentElementValue;
//                currentElementValue++;
//            }

        int currentElementValue = 1;  // обьявляем переменную currentElementValue типа int и присваиваем значение 1
        for (int row = 0;  // вызываем цикл.  переменной row типа int присваиваем значение 0
             row < massiv.length;  // переменная row меньше длины массива massiv
             row++) {  // шаг цикла +1
            for (int column = massiv.length - 1; column >= 0; column--) {
                massiv[row][column] = currentElementValue;
                currentElementValue++;
            }
        }
        return massiv;
    }

    /*
     * for (*обявление переменной и его начального значения*;
     *      *условие при котором цикл будет продолжаться*;
     *      *правило изменения переменной*)
     * */

    private static int[][] thirdPattern(int[][] massiv) {


        int currentElementValue = 1;
//        for (int row = massiv.length)
//
//
        return massiv;
    }

    private static int[][] secondPattern(int[][] massiv) {
        int currentElementValue = 1;
        for (int row = 0;
             row < massiv.length;
             row++) {
            if ((row + 1) % 2 == 0) {
                for (int column = 0;
                     column < massiv.length;
                     column++) {
                    massiv[row][column] = currentElementValue;
                    currentElementValue++;
                }
            } else {
                for (int column = massiv.length - 1;
                     column >= 0;
                     column--) {
                    massiv[row][column] = currentElementValue;
                    currentElementValue++;
                }
            }
        }
        return massiv;
    }


    private static int[][] firstPattern(int[][] massiv) {
        int currentElementValue = 1;
        for (int row = 0; row < massiv.length; row++) {
            for (int column = 0; column < massiv[row].length; column++) {
                massiv[row][column] = currentElementValue;
                currentElementValue++;
            }
        }
        return massiv;
    }

    static void printArray(int[][] array) {

    }

//    static void increament() {
//        int i = 0;
////        i = i + 1;
////        i += 1;
//        i++;
//        System.out.println(i);
//    }
}
