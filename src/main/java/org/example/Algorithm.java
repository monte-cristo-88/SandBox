package org.example;

public class Algorithm {    // обьявление класса !!!переменной!!! Algoritm

    public static void main(String[] args) { /* обьявление статичного метода с названием main !!!класса Main!!!
                                                с параметром типа массив  String с названием args */
        int[][] pattern = new int[5][5]; /*  обьявляем переменную pattern типа int[][] и присваиваем
                                             новый массив int[][] с длиной и шириной 5  */


//        increament();

//        pattern = firstPattern(pattern);
//        pattern = secondPattern(pattern);
//        pattern = thirdPattern(pattern);
        pattern = fourthPattern(pattern);   /* присваиваем массиву pattern значение результата вызова метода
                                               forthPattern передаем перменную pattern как параметр */

        awefaqdfgsadfs(pattern);    //  вызов метода awefaqdfgsadfs с передачей переменной pattern  как параметр
    }

    private static int[][] fourthPattern(int[][] хуякХуяк) {  /* обьявляем статичный метод fourthPattern возвращающий
                                                               тип массив int с !!!переменной!!!
                                                               приниамаем параметр массива int с названием хуякХуяк */


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

        int currentElementValue = 1; // обьявление переменной типа int с названием currentElementValue со значением 1
        for (int row = 0;  // вызов цикла for с типом перменной row с присвоением значения 0
             row < хуякХуяк.length;  // переменная row меньше длины массива хуякХуяк
             row++) {   // шаг цикла  +1
                            //  возможные значение переменной row = 0;1;2;3;4;
            for (int column = хуякХуяк.length - 1; /* вызов цикла for где переменной column типа int присваиваем
                                                      значение длина массива хуякХуяк -1 */
                 column >= 0;   // переменная column больше иои равен 0
                 column--) {   // шаг цикла -1
                            //  возможные значение переменной column = 4;3;2;1;0;

                хуякХуяк[row][column] = currentElementValue;   /* присваиваем элементу в ячейку column одномерного массива
                                                                в ячейку row двумерного массива значение currentElementValue */
                currentElementValue++;    // инкриментируем переменную currentElementValue
            }
        }
        return хуякХуяк;    // возвращаем массив хуякХуяк
    }

    private static int[][] fourthPatternDuplicate(int[][] massiv) {
        int currentElementValue = 1;
        int row = 0;
        int column = massiv.length;
        massiv[row][column] = currentElementValue;
        currentElementValue++;
        column++;
        massiv[row][column] = currentElementValue;
        currentElementValue++;
        column++;
        massiv[row][column] = currentElementValue;
        currentElementValue++;
        column++;
        massiv[row][column] = currentElementValue;
        currentElementValue++;
        column++;
        massiv[row][column] = currentElementValue;
        currentElementValue++;

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

    static void awefaqdfgsadfs(int[][] array) {

    }

//    static void increament() {
//        int i = 0;
////        i = i + 1;
////        i += 1;
//        i++;
//        System.out.println(i);
//    }
}
