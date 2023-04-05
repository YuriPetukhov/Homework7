public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int deposit = 0;
        int sum = 15_000;
        int month = 1;

        while (deposit < 2_459_000) {
            deposit = deposit + sum;
            month ++;

        }

        System.out.println("Итого потребуется " + month + " месяцев, чтобы накопить " + deposit + " рублей");

    }

    public static void task2 () {
        System.out.println("Задача 2");

        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i ++;
        }
        System.out.println();

        for (i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

    }

    public static void task3 () {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRate = 12_000 * 17;
        int deathRate = 12_000 * 8;
        int period = 1;

        while (period <= 10) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + period + " численность населения составляет " + population);
            period ++;
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");

    }

    public static void task5 () {
        System.out.println("Задача 5");

    }

    public static void task6 () {
        System.out.println("Задача 6");

    }

    public static void task7 () {
        System.out.println("Задача 7");

    }

    public static void task8 () {
        System.out.println("Задача 8");

    }

    public static void task9 () {
        System.out.println("Задача 9");

    }

    public static void task10 () {
        System.out.println("Задача 10");

    }
}