package lesson7.task4;

public class CycleWhileTest {

    public static void main(String[] args) {

        // Вывести в консоль сумму всех чисел от 1 до 10
        // 1 + 2 + 3 + ... + 10
        // Решить задачу с помощью цикла while

        int sum = 0;
        int current = 1;

        while (current <= 10) {
            sum = sum + current;
            current++;
            System.out.println("Значение переменной sum: " + sum);
            System.out.println("Значение переменной current: " + current);
        }

        System.out.println("Сумма: " + sum);
    }
}
