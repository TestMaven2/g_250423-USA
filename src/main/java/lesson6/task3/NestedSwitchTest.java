package lesson6.task3;

public class NestedSwitchTest {

    public static void main(String[] args) {

        String storageName = "Beta";
        int gateNumber = 2;

        switch (storageName) {
            case "Alpha":
                System.out.println("Выгрузка на складе Альфа");
                break;
            case "Beta":
                System.out.println("Выгрузка на складе Бета");
                switch (gateNumber) {
                    case 1:
                        System.out.println("Ворота номер 1");
                        break;
                    case 2:
                        System.out.println("Ворота номер 2");
                        break;
                    case 3:
                        System.out.println("Ворота номер 3");
                        break;
                }
                break;
            case "Gamma":
                System.out.println("Выгрузка на складе Гамма");
                break;
        }

        System.out.println("Конец программы");
    }
}
