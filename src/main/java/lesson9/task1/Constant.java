package lesson9.task1;

public class Constant {

    public static int fieldVariable = 15;
    private static final int FIELD_CONSTANT = 20;

    public static void main(String[] args) {

//        Переменная.
        int localVariable = 5;

//        Константа.
        final int LOCAL_CONSTANT = 7;

//        Можем поменять значение переменной.
        localVariable = 10;

//        Ошибка. Не можем поменять значение константы.
//        LOCAL_CONSTANT = 10;

        test1();
        test2();
    }

    public static void test1() {
        // Не можем использовать локальные переменные
        // и константы за пределами того блока, где они объявлены.
//        System.out.println(localVariable);
//        System.out.println(LOCAL_CONSTANT);
        System.out.println(fieldVariable);
        System.out.println(FIELD_CONSTANT);
    }

    public static void test2() {
        System.out.println(fieldVariable);
        System.out.println(FIELD_CONSTANT);

        fieldVariable = 30;
//        FIELD_CONSTANT = 30;
    }
}
