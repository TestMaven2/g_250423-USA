package lesson11;

public class SearchUtils {

    public static int linearSearch(int[] array, int element) {

        for (int i = 0; i < array.length; i++) {
            // Если число найдено, возвращаем текущий индекс
            if (array[i] == element) {
                return i;
            }
        }
        // Если число в массиве не найдено, возвращаем -1
        return -1;
    }

    public static int binarySearch(int[] array, int element) {

        int start = 0;
        int end = array.length - 1;
        int currentIndex = end / 2;
        int step = 0;

        while (start <= end) {

            System.out.println("Шаг: " + ++step);

            int currentElement = array[currentIndex];
            if (currentElement == element) {
                return currentIndex;
            } else if (element < currentElement) {
                end = currentIndex - 1;
            } else {
                start = currentIndex + 1;
            }
            currentIndex = (start + end) / 2;
        }
        return -1;
    }

    public static int jumpSearch(int[] array, int element) {

        int jump = (int) Math.sqrt(array.length);
        int start = 0;
        int end = jump;

        // Цикл прыжков
        while (end < array.length) {

            if (array[end] >= element) {
                break;
            }

            start = end + 1;
            end = start + jump;
        }

        // Проверка, что не вышли за границы массива
        if (end >= array.length) {
            end = array.length - 1;
        }

        // Линейный поиск между индексами start и end
        for (int i = start; i <= end; i++) {
            if (array[i] == element) {
                return i;
            }
            if (array[i] > element) {
                break;
            }
        }
        return -1;
    }
}