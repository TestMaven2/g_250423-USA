package lesson4.task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomTest {

    public static void main(String[] args) {

        System.out.println("Первый способ");
        System.out.println((int) (Math.random() * 10) + 10);
        System.out.println((int) (Math.random() * 10) + 10);
        System.out.println((int) (Math.random() * 10) + 10);
        System.out.println((int) (Math.random() * 10) + 10);
        System.out.println((int) (Math.random() * 10) + 10);

        System.out.println("Второй способ");
        Random random = new Random();
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));
        System.out.println(random.nextInt(20));

        System.out.println("Третий способ");
        System.out.println(ThreadLocalRandom.current().nextInt(15,20));
        System.out.println(ThreadLocalRandom.current().nextInt(15,20));
        System.out.println(ThreadLocalRandom.current().nextInt(15,20));
        System.out.println(ThreadLocalRandom.current().nextInt(15,20));
        System.out.println(ThreadLocalRandom.current().nextInt(15,20));
    }
}
