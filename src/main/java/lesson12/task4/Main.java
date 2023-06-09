package lesson12.task4;

public class Main {

    public static void main(String[] args) {

        // Написать метод, который в качестве параметров принимает две строки,
        // объединяет их, разворачивает и возвращает в качестве результата.

        System.out.println(getReversedConcatString("Hello", "World"));
    }

    public static String getReversedConcatString(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        result.append(word1).append(word2);
        result.reverse();
        return result.toString();
    }
}