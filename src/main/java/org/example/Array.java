package org.example;

public class Array {
    public static void main(String[] args) {
        singularMassiv();
        doubleMassiv();
    }

    private static void singularMassiv() {
        int[] ints = new int[5];
        ints[2] = -43;   // присваиваем элементу масссива ints в ячейке 2 значение -43
        ints[3] = -523;  //
        ints[4] = -4235;
        System.out.println(ints);
    }

    private static void doubleMassiv() {
        int[][] ints = new int[3][3];
        ints[0][1] = -123;
        ints[2][1] = 12532;
        ints[0][2] = -3251;

        System.out.println(ints);
    }

    private static void setDoubleMassiv() {
        int[][] ints = new int[3][3];
        ints [1][2] = 12; // присваиваем элементу в ячейке 2 одномерного массива в ячейку 1 двумерного массива значение 12
        ints [2][1] = 34;// присваиваем элементу в ячейке 1 одномерного массива в ячейку 2 двумерного массива значение 34
        ints [1][0] = 213;// присваиваем элементу в ячейке 0 одномерного массива в ячейку 1 двумерного массива значение 213
        ints [0][1] = 513;// присваиваем элементу в ячейке 1 одномерного массива в ячейку 0 двумерного массива значение 513
        ints [0][2] = 123;// присваиваем элементу в ячейке 2 одномерного массива в ячейку 0 двумерного массива значение 123
        ints [1][0] = 645;// присваиваем элементу в ячейке 0 одномерного массива в ячейку 1 двумерного массива значение 645
    }

    private void asd() {
        int[][] asdasd = new int[3][3];

//        asdasd[0];
//        asdasd[1];
//        asdasd[2];
//        asdasd[0][0];
//        asdasd[0][1];
//        asdasd[0][2];
//        asdasd[1][0];
//        asdasd[0][1];
//        asdasd[0][2];
//        asdasd[2][0];
//        asdasd[2][1];
//        asdasd[2][2];
    }
}
