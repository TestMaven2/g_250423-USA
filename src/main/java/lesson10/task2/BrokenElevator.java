package lesson10.task2;

public class BrokenElevator {

    public static void main(String[] args) {

//        сломанный лифт
//        лифт, находящийся на первом этаже здания высотой H,
//        должен подняться на последний этаж. Лифт сломан.
//        Каждый раз он поднимается на N этажей и спускается на M этажей.
//        Если на последнем подьеме лифт превысил количество этажей,
//        то считается что лифт поднялся на самый верх.
//        Найдите количество подьемов, которые понадобятся лифту.
//
//        Ввод:
//        H = 200, N = 50, M = 1
//        Ответ: 5
//        Объяснение:
//        Первый подьем: 51 - 1 = 50
//        Второй подьем: 50 + 50 - 1 = 99
//        Третий подьем: 99 + 50 - 1 = 148
//        Четвертый подьем: 148 + 50 - 1 = 197
//        Пятый подьем: выйти за пределы H.

        // 4   7   10   13   16   20
//
//        реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)

        System.out.println(numberOfLifts(20, 5, 2));
        System.out.println(numberOfLifts(1233, 23, 7));
        System.out.println(numberOfLifts(200, 12, 4));
        System.out.println(numberOfLifts(567, 43, 6));
        System.out.println(numberOfLifts(123, 4, 2));
        System.out.println(numberOfLifts(123, 4, 2));

        int result = numberOfLifts(20, 5, 2);
    }

    public static int numberOfLifts(int floor, int stepUp, int stepDown) {

        int currentFloor = 1;
        int numberOfLifts = 0;

        while (currentFloor < floor) {
            currentFloor += stepUp;
            numberOfLifts++;

            if (currentFloor >= floor) {
                break;
            }

            currentFloor -= stepDown;
        }
        return numberOfLifts;
    }
}
