package lesson7.task3;

public class CycleTest {

    public static void main(String[] args) {

        // Вывести в консоль слово Hello 10 раз

        int a = 0;

        for (; a < 10; a = a + 3) {
            System.out.println("Hello");
            System.out.println(a);
        }
        System.out.println("Конец цикла");

        System.out.println("Вторая задача");

        // Вывести в консоль числа от 10 до 1 в порядке убывания

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}