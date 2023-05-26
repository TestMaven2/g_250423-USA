package lesson8.task3;

import java.util.Arrays;

public class ArrayMethodsTest {

    public static void main(String[] args) {

        int[] source = {8, 2, 7, 1, 8, 2, 6, 5, 4, 0, 9};
        int[] target = source.clone();
        System.out.println("source: " + Arrays.toString(source));
        System.out.println("target: " + Arrays.toString(target));

        int[] numbers = Arrays.copyOf(source, 5);
        System.out.println(Arrays.toString(numbers));

        int[] numbers1 = Arrays.copyOfRange(source, 4, 8);
        System.out.println(Arrays.toString(numbers1));

        Arrays.sort(source);

        System.out.println(Arrays.toString(source));
    }
}
