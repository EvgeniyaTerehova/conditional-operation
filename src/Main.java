public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();

    }
    public static void task1() {
        System.out.println("задача 1");
        int clientOS = 1;

        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
    public static void task2() {
        System.out.println("задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2017;

        if (clientOS==1 && clientDeviceYear < 2015){
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else if (clientOS==1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {
        System.out.println("задача 3");
        int year = 2023;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год" + year + "- високосный");
        } else {
            System.out.println("Год" + year + "- не високосный");
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int devilaryDistance = 74;
        if (devilaryDistance >= 0 && devilaryDistance <= 20) {
            System.out.println("Доставка занимает 1 сутки");
        } else if (devilaryDistance > 20 && devilaryDistance <= 60) {
            System.out.println("Доставка занимает 2 суток");
        } else if (devilaryDistance >= 20 && devilaryDistance <= 100) {
            System.out.println("Доставка занимает 3 суток");
        } else  {
            System.out.println("Доставки нет");
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        int month = 9;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц под номером" + month + "относится к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц под номером" + month + "относится к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц под номером" + month + "относится к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц под номером" + month + "относится к сезону осень");
                break;
            default:
                System.out.println("Нет такого месяца под номером" + month);
        }
    }
}
