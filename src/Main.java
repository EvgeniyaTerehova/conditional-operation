public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен" + age + ", то  он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("задача 2");
        int outdoorTemperature = 10;
        if (outdoorTemperature > 5) {
            System.out.println("Сегодня тепло " + outdoorTemperature + " градусов, можно идти без шапки");
        }
        if (outdoorTemperature < 5) {
            System.out.println("Сегодня хлодно " + outdoorTemperature + " градусов, нужно надеть шапку");
        }

    }

    public static void task3() {
        System.out.println("задача 3");
        int speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость" + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость" + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int age = 4;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен" + age + ", то ему нужно ходить в детский сад");
        }
        int age2 = 15;
        if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен" + age2 + ", то ему нужно ходить в школу");
        }
        int age3 = 21;
        if (age3 >= 18 && age3 < 24) {
            System.out.println("Если возраст человека равен" + age3 + ", то его место в университете");
        }
        int age4 = 29;
        if (age4 > 24) {
            System.out.println("Если возраст человека равен" + age4 + ", то ему пора ходить на работу");
        }


    }
    public static void task5() {
        System.out.println("задача 5");
        int age = 8;
        if (age <5) {
            System.out.println("он не может кататься на аттракционе");
        }
        if (age > 5 && age <14) {
            System.out.println("он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else {
            System.out.println("он может кататься без сопровождения взрослого");
        }

    }
    public static void task6() {
        System.out.println("задача 6");
        int ticketsSold = 79;
        int trainСarСapacity = 102;
        int seating = 60;
        if (ticketsSold >=seating && ticketsSold < trainСarСapacity) {
            System.out.println("сидячих мест нет, есть только стоячие");
        }
        if (ticketsSold == trainСarСapacity) {
            System.out.println("вагон полон");
        }

        else{
            System.out.println("места есть");
        }

    }
    public static void task7() {
        System.out.println("задача 7");
        int one = 43;
        int two = 72;
        int three = 94;
        if (one < two && two < three){
            System.out.println( three + "большее число");
        }
        else {
            System.out.println( two + "большее число");
        }

    }
}
