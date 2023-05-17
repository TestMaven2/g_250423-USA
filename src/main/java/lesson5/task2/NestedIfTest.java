package lesson5.task2;

public class NestedIfTest {

    public static void main(String[] args) {

        int a = 17;
        int b = 15;
        int c = 20;

        if (a < b) {
            System.out.println("А меньше, чем В");
            if (a < c) {
                System.out.println("И при этом А меньше, чем С");
            }
        }
    }
}