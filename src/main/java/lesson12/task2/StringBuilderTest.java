package lesson12.task2;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        // Выведем в консоль длину и ёмкость
        System.out.println("Длина " + builder.length());
        System.out.println("Ёмкость " + builder.capacity());

        StringBuilder builder1 = new StringBuilder(50);
        System.out.println("Ёмкость нового объекта " + builder1.capacity());

        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println("Длина третьего объекта " + builder2.length());
        System.out.println("Ёмкость третьего объекта " + builder2.capacity());
    }
}
