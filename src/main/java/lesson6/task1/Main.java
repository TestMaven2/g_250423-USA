package lesson6.task1;

public class Main {

    public static void main(String[] args) {

        // Инкремент, постфиксная и префиксная запись.

        int value = 5;

        System.out.println("Значение переменной до операции: " + value);

        value = value + 1;

        // Постфиксная запись
        value++;

        // Префиксная запись
        ++value;

        System.out.println("Значение переменной: " + value);

        System.out.println(value++);
        System.out.println(value);
    }
}