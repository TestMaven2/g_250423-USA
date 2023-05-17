package lesson5.task1;

public class LogicalTest {

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = 20;
        int d = 20;

        boolean result = a > b && c == d;

        System.out.println("Result: " + result);

        boolean result1 = a > b;
        boolean result2 = c == d;
        boolean totalResult = result1 && result2;

        System.out.println(result1 + " " + result2 + " " + totalResult);

        System.out.println(b <= a && c < a);

        System.out.println(c <= b || a > d || c >= a);
    }
}
