package lesson9.task1;

public class Main {

//    Переменные и их типы, инициализация.
//    Методы и конструкторы.
//    Логические выражения и конструкция if-else.
//    Конструкция switch и тернарный оператор.
//    Циклы.
//    Массивы.

    public static void main(String[] args) {

//        Write a program that calculates how many
//        extra calories there will be
//        if you’ll buy a pizza with a diameter of 28 cm instead of a pizza with
//        a diameter of 24 cm. To solve this, let's assume that each square
//        centimeter of pizza is 40 calories.

        // Объявление переменной: int - тип, diameter1 - имя переменной.
        int diameter1;

        // Инициализация переменной, то есть присвоение первоначального значения.
        diameter1 = 24;

        // Объявление и инициализация в одной строке.
        int diameter2 = 28;
        int caloriesPerSquareCent = 40;

        double area1 = calculatePizzaArea(diameter1);
        double area2 = calculatePizzaArea(diameter2);

        printCaloriesDifference(area1, area2, caloriesPerSquareCent);

//        System.out.println(Constant.FIELD_CONSTANT);
    }

    public static void printCaloriesDifference(double pizzaArea1, double pizzaArea2, int calories) {
        double result = (pizzaArea2 - pizzaArea1) * calories;
        System.out.println("Разница в калориях: " + result);
    }

    public static double calculatePizzaArea(int diameter) {
        double pizzaArea = Math.PI * diameter * diameter / 4;
        return pizzaArea;
    }
}