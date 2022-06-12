import java.time.Year;

public class Main {
    public static void printSeparator() {
        System.out.println();
        System.out.println("------------------");
        System.out.println();
    }

    public static int checkYear(int[] years) {
        int year = 0;
        for (int i = 0; i < years.length; i++) {
            year = years[i] % 4;
            if (year == 0 || years[i] % 400 == 0 || years[i] % 100 == 0) {
                System.out.println(years[i] + " год является високосным.");
            } else if (year != 0) {
                System.out.println(years[i] + " год не является високосным.");
            }
        }
        return year;
    }
    public static int checkApp(int os, int year) {
        if ((os == 1) && (year >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((os == 1) && (year < 2015)){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((os == 0) && (year >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        return os;
    }

    public static int deliveryCard(int distance) {
        if (distance <= 20) {
            System.out.println("доставка будет осуществлена в течении дня");
        } else if ((distance > 20) && (distance <= 60)) {
            System.out.println("доставка будет осуществлена в течении 2х дней");
        } else if ((distance > 60) && (distance <= 100)) {
            System.out.println("доставка будет осуществлена в течении 3х дней");
        } else {
            System.out.println("срок доставки неизвестен");
        }
        return distance;
    }

    public static void main(String[] args) {
        int[] years = {2000, 2002, 2004, 2006,};
        printSeparator();
        checkYear(years);
        printSeparator();

        int os = 0;
        int year = 2016;
        checkApp(os, year);
        printSeparator();

        int distance = 21;
        deliveryCard(distance);
        printSeparator();
    }
}
