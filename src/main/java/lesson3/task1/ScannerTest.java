package lesson3.task1;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println("Вы ввели: " + word);

    }
}