package lesson10.task1;

import java.util.Random;
import java.util.Scanner;

public class Students {

    public static void main(String[] args) {

//        *Organize input through the scanner.
//                Write a method that takes as an argument the number
//                of students in the class, implement a random selection
//                from this number, starting with the second student.
//        Print the result to the console.
//        Example:
//        entrance 18
//        We make a choice in the range 2 - 18
//        exit 6

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int input = scanner.nextInt();
        System.out.println(getRandomStudentNumber(input));
    }

    public static int getRandomStudentNumber(int numberOfStudents) {
        if (numberOfStudents < 2) {
            System.out.println("Количество студентов не может быть менее 2");
            return -1;
        }
        Random random = new Random();
        return random.nextInt(numberOfStudents - 1) + 2;
    }
}
