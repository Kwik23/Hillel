package src.lesson15;

public class CheckSumInRange {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;

        boolean result = checkSumInRange(num1, num2);
        System.out.println(result);
    }

    public static boolean checkSumInRange(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }
}
