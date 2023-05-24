package lesson7.task1;

public class Pizza {

    public static void main(String[] args) {

//        Напишите программу, которая подсчитает, сколько дополнительных калорий будет,
//        если вы купите пиццу диаметром 28 см вместо пиццы диаметром 24 см.
//        Будем считать, что в каждом квадратном сантиметре пиццы содержится 40 калорий.

        double smallDiameter = 24;
        double bigDiameter = 28;

        double smallArea = calculatePizzaArea(smallDiameter);
        double bigArea = calculatePizzaArea(bigDiameter);

//        double smallArea = 3.14 * smallDiameter * smallDiameter/ 4;
//        double bigArea = 3.14 * bigDiameter * bigDiameter / 4;

        System.out.println((bigArea - smallArea) * 40);
    }

    public static double calculatePizzaArea(double diameter) {
        return 3.14 * diameter * diameter / 4;
    }
}
