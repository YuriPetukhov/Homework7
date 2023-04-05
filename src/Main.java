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
        int birthRate = population/1000 * 17;
        int deathRate = population/1000 * 8;
        int period = 1;

        while (period <= 10) {
            population = population + birthRate - deathRate;
            System.out.println("Год " + period + " численность населения составляет " + population);
            period ++;
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int deposit = 15_000;

        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit = deposit + deposit/100*7;
            System.out.println("Месяц " + i + ": сумма накоплений равна " + deposit + " рублей");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int deposit = 15_000;

        for (int i = 1; deposit <= 12_000_000; i++) {
            deposit = deposit + deposit/100*7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ": сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int deposit = 15_000;

        for (int i = 1; i <= 108; i++) {
            deposit = deposit + deposit/100*7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ": сумма накоплений равна " + deposit + " рублей");
            }
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int friday = 2;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int yearBefore = 1823;
        int yearAfter = 2123;
        int year = 0;

        while (year < yearAfter) {
            if (year > yearBefore) {
                System.out.println(year);
            }
            year = year + 79;
        }
    }
}