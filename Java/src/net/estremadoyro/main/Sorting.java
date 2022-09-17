package net.estremadoyro.main;

public class Sorting {
    // n = 4
    // i -> 0, 1, 2, 3
    // [3, 6, 34, 12]
    // i=0 | j -> 0, 1, 2 |
    // j = 0, j+1 = 1
    // [3, 6, 34, 12]
    // j = 1, j+1 = 2
    // [3, 6, 34, 12]
    // j = 2, j+1 = 3
    // [3, 6, 12, 34]
    public static Integer[] bubbleSort(Integer[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int aux = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = aux;
                }
            }
        }
        return input;
    }

    public static Integer[] mergeSort(Integer[] input) {
        return input;
    }

    public static Integer[] quickSort(Integer[] input) { return input; }
}
