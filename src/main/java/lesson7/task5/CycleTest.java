package lesson7.task5;

public class CycleTest {

    public static void main(String[] args) {

        System.out.println("Начало программы");

        for (int i = 0; i < -1; i++) {
            System.out.println("Отработал цикл for");
        }

        int a = 5;
        int b = 10;

        while (a > b) {
            System.out.println("Отработал цикл while");
        }

        System.out.println("Конец программы");
    }
}
