package lesson4.task1;

public class CatTest {

    public static void main(String[] args) {

        System.out.println("Перед созданием кота.");
        Cat firstCat = new Cat();
        System.out.println("После создания кота.");

        System.out.println("Создаём второго кота.");
        Cat secondCat = new Cat(7);

        System.out.println("Возраст первого кота:");
        System.out.println(firstCat.age);

        System.out.println("Возраст второго кота:");
        System.out.println(secondCat.age);

        System.out.println("Создаём третьего кота");
        Cat thirdCat = new Cat("Чёрный");

        System.out.println("Цвет третьего кота:");
        System.out.println(thirdCat.color);

        System.out.println("Создаём четвёртого кота");
        Cat fourthCat = new Cat(3, "Рыжий");

        System.out.println("Возраст четвёртого кота:");
        System.out.println(fourthCat.age);
        System.out.println("Цвет четвёртого кота");
        System.out.println(fourthCat.color);

        // Так мы можем писать комментарии.
    }
}
