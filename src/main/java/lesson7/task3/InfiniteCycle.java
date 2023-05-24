package lesson7.task3;

public class InfiniteCycle {

    public static void main(String[] args) {

//        for (int i = 0; i >= 0; i++) {
//            System.out.println("Hello");
//        }

//        for (;;) {
//            System.out.println("Hello");
//        }

        for (double i = 100; i > 0; i = i / 2) {
            System.out.println(i);
        }
    }
}