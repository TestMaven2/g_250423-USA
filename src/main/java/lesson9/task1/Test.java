package lesson9.task1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

//        Для введённого пользователем с клавиатуры натурального числа
//        посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).
        // 8234 -> 8 + 2 + 3 + 4 = 17

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int input = scanner.nextInt();
        int sum = 0;
        int currentDigit;

        while (input > 0) {
            currentDigit = input % 10;
//            sum = sum + currentDigit;
            sum += currentDigit;
//            input = input / 10;
            input /= 10;
        }

        System.out.println("Сумма всех цифр числа равна " + sum);
    }
}
