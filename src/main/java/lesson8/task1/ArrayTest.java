package lesson8.task1;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        double[] doubleArray;
        boolean[] booleanArray;

        numbers[5] = 17;

        System.out.println(numbers[5]);
        System.out.println(numbers[3]);

        int[] numbers1 = {4, 3, 9, 6, 7, 15, 17, 3, 4, 0, 9};
        System.out.println("Длина массива: " + numbers1.length);
        System.out.println("Значение в ячейке 4: " + numbers1[4]);

        System.out.println("Вывод всех значений в цикле for:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i]);
            if (i < numbers1.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        System.out.println("Вывод всех значений в цикле for-each:");
        for (int value : numbers1) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Вывод всех значений с помощью готового метода:");
        System.out.println(Arrays.toString(numbers1));
    }
}
