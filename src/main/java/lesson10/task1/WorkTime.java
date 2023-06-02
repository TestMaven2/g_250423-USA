package lesson10.task1;

import java.util.Random;

public class WorkTime {

    public static void main(String[] args) {

        Random random = new Random();
        int seconds = random.nextInt(28801);

        System.out.println("Количество секунд до конца дня: " + seconds);
        int hours = seconds / 3600;

        if (hours == 0) {
            System.out.println("До конца дня осталось менее часа");
        } else {
            System.out.println("Количество часов до конца дня: " + hours);
        }
    }
}
