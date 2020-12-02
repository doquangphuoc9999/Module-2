import java.util.Scanner;

public class NextDayCalculator {
    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static int checkMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 8:
            case 11:
                return 30;
            case 2:
                return checkYear(year) ? 29 : 28;
        }
        return month;
    }

    public static String checkDay(int day, int month, int year){
        if (++day > checkMonth(year,month)){
            day = 1;
            if (++month > 12){
                month = 1;
                year++;
            }
        }
        return String.format("%d/%d/%d", day,month,year);
    }


    public static String nextDay(String dateStr){
        String[] date = dateStr.split("/");
        if (date.length != 3){
            return "illegal";
        }
        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        return checkDay(day,month,year);

    }


}
