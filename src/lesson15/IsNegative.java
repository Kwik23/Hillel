package src.lesson15;

public class IsNegative {
    public static void main(String[] args) {
        int number = -7;

        boolean result = isNegative(number);
        System.out.println(result);
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}
