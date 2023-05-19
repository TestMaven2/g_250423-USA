package lesson6.task4;

public class TernaryTest {

    public static void main(String[] args) {

        int a = 30;
        int b = 20;
        int max;

        // В переменную max записать максимальное значение из переменных a и b

//        if (a > b) {
//            max = a;
//        } else {
//            max = b;
//        }

        max = a > b ? a : b;

        System.out.println("Максимальное число - " + max);
    }
}