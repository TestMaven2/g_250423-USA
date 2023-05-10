package lesson3.task2;

public class TypeTest {

    public static void main(String[] args) {

        byte b = 50;

        System.out.println("Byte: " + b);

        short s = b;

        System.out.println("Short: " + s);

        System.out.println("-------");

        short s1 = 80;

        System.out.println("Значение Short: " + s1);

        byte b1 = (byte) s1;

        System.out.println("Значение Byte: " + b1);
    }
}
