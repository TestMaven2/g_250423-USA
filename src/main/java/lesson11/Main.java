package lesson11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 9, 1, 0, 12, 15, 8, 7, 21, 17, 4, 0, 9, 11, 14, 15};

        System.out.println("Результат линейного поиска: " + SearchUtils.linearSearch(array, 15));
        System.out.println();

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

//        Arrays.sort(array);
//        SortUtils.bubbleSort(array);
//        SortUtils.insertionSort(array);
        SortUtils.selectionSort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Результат двоичного поиска: " + SearchUtils.binarySearch(array, 15));
        System.out.println();

        System.out.println("Результат поиска прыжками: " + SearchUtils.jumpSearch(array, 15));
    }
}