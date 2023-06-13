package src.lesson15;

public class PrintStringMultipleTimes {
    public static void main(String[] args) {
        String text = "Привіт!";
        int count = 3;

        printStringMultipleTimes(text, count);
    }

    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
