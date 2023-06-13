package src.lesson15;

public class IsLeapYear {
    public static void main(String[] args) {
        int year = 2024;

        boolean result = isLeapYear(year);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }
}
