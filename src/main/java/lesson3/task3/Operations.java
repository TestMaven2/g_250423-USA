package lesson3.task3;

public class Operations {

    public static void main(String[] args) {

        int i = 12;
        double d = 7.5;

        double sum = i + d;
        System.out.println(sum);

        int i1 = 10;
        int i2 = 4;
        System.out.println(i1 / (double) i2);

        char c = '4';
        String s = "4";
        int sum1 = i1 + Integer.parseInt(String.valueOf(c));
        int sum2 = i1 + Character.getNumericValue(c);

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println("--------");
        String s1 = "Hello World!";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        System.out.println(s1.substring(6, 9));

    }
}
