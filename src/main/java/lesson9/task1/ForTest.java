package lesson9.task1;

public class ForTest {

    public static void main(String[] args) {

        // Вывести в консоль 20 раз строку "Строка номер N", где N - номер строки.

        for (int i = 1; i <= 20; i++) {
            System.out.println("Строка номер " + i);
        }

        // Вывести в консоль все числа от 30 до 0, кратные трём, в порядке убывания.

        for (int i = 30; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // Вывести все слова из массива, при этом пронумеровать строки.
        String[] fruits = {"Orange", "Melon", "Peach", "Apple", "Pear"};

        for (int i = 0; i < fruits.length; i++) {
            // 1. Orange
            System.out.println(i + 1 + ". " + fruits[i]);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}