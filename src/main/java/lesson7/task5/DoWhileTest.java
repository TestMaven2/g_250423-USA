package lesson7.task5;

import java.util.Scanner;

public class DoWhileTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        do {
            System.out.println("Выберите вариант игры");
            System.out.println("1. Друг против друга");
            System.out.println("2. Против компьютера");

            input = scanner.nextInt();
        } while (input < 1 || input > 2);

        System.out.println("Ваш выбор - " + input);
    }
}
