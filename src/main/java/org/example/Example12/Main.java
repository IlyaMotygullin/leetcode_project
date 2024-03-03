package org.example.Example12;

import java.util.Arrays;

public class Main {
    /*
    Дан бинарный массив, нужно отсортировать за линейное время и пространоство - константное
     */
    public static void main(String[] args) {
        int array[] = {1, 0, 1, 0, 1, 0, 0, 1};
//        sortArray(array);
        sortBinArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortBinArray(int[] array) {
        int pivot = 1;
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < pivot) {
                swap(array, i, j);
                j++;
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void sortArray(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[index] = 0;
                index++;
            }
        }
        for (int i = index; i < array.length; i++) {
            array[index] = 1;
            index++;
        }
    }
}
