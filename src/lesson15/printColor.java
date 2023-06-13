package src.lesson15;

public class printColor {
    public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 90;

        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }
    }
}
