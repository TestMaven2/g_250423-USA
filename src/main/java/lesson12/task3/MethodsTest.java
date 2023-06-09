package lesson12.task3;

public class MethodsTest {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        // Добавляет значение к уже существующей строке
        builder.append("Banana").append("Apple").append("Orange").append("Orange").append("Peach");
        System.out.println(builder);

        // Добавляет символ, соответствующий переданному коду по таблице кодировки
        builder.appendCodePoint(60);
        System.out.println(builder);

        // Удаление подстроки по индексам
        builder.delete(11, 17);
        System.out.println(builder);

        // Удаление символа по индексу
        builder.deleteCharAt(builder.length() - 1);
        System.out.println(builder);

        // Получаем символ по индексу
        System.out.println(builder.charAt(6));

        // Получаем индекс по символу
        System.out.println(builder.indexOf("App"));

        // Вставляем подстроку
        builder.insert(11, "Cherry");
        System.out.println(builder);

        // Заменяем подстроку на другую подстроку
        builder.replace(6, 11, "Watermelon");
        System.out.println(builder);

        // Получаем подстроку
        System.out.println(builder.substring(16));
        System.out.println(builder.substring(16, 22));

        // Преобразуем StringBuilder в String
        String result = builder.toString();
        System.out.println(result);

        builder.append("Blueberry");

        // Уменьшаем размер внутреннего хранилища
        System.out.println("Длина " + builder.length());
        System.out.println("Ёмкость " + builder.capacity());
        builder.trimToSize();
        System.out.println("Длина " + builder.length());
        System.out.println("Ёмкость " + builder.capacity());

        // Переворачиваем строку
        builder.reverse();
        System.out.println(builder);
    }
}
