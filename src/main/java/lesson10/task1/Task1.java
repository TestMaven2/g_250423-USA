package lesson10.task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

//        Создать программу, выводящую на экран случайно сгенерированное
//        трёхзначное натуральное число и его наибольшую цифру.

        int number = getRandomNumber();
        System.out.println("Сгенерированное число: " + number);
        int result = getMaxDigit(number);
        System.out.println("Максимальная цифра числа: " + result);
        result = getMaxDigit2(number);
        System.out.println("Максимальная цифра числа вторым способом: " + result);

        System.out.println(getMaxDigit(765943234));
        System.out.println(getMaxDigit2(765943253));
    }

    public static int getMaxDigit2(int number) {
        // 456 -> "456"
        String stringNumber = String.valueOf(number);
        // "456" -> ["4", "5", "6"]
        String[] digits = stringNumber.split("");

        int max = 0;

        for (String value : digits) {
            int currentNumber = Integer.parseInt(value);
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        return max;
    }

    public static int getMaxDigit(int number) {
        // 1 способ
        // 365 / 100 = 3
        int first = number / 100;
        // 365 / 10 % 10 = 6
        int second = number / 10 % 10;
        // 365 % 10 = 5
        int third = number % 10;

        if (first >= second && first >= third) {
            return first;
        } else if (second >= first && second >= third) {
            return second;
        } else {
            return third;
        }
    }

    public static int getRandomNumber() {
        Random random = new Random();
        // 100 - 999
        // random.nextInt(900) -> (0 - 899) + 100 -> (100 - 999)
        return random.nextInt(900) + 100;
    }
}