import java.time.Year;

public class Main {

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

        public static void main (String[]args){
            int[] years = {2000, 2002, 2004, 2006,};
            checkYear(years);
        }
    }