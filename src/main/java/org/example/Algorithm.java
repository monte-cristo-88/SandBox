package org.example;

public class Algorithm {

    public static void main(String[] args) {    //
        int[][] pattern = new int[5][5];

//        increament();

//        pattern = firstPattern(pattern);
//        pattern = secondPattern(pattern);
//        pattern = thirdPattern(pattern);
        pattern = fourthPattern(pattern);

        printArray(pattern);
    }

    private static int[][] fourthPattern(int[][] massiv) {



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

        int currentElementValue = 1;
        for (int row = 0;
             row < massiv.length;
             row++) {
            for (int column = massiv.length - 1;
                 column >= 0;
                 column--) {
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
        for (int row = 0;
             row < massiv.length;
             row++) {
            for (int column = 0;
                 column < massiv[row].length;
                 column++) {
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
