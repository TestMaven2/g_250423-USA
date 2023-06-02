package lesson10.task1;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {

        // Сгенерировать 30 случайных чисел из диапазона -100 до 100

        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(201) - 100;
            System.out.print(randomNumber + " ");
        }
    }
}
