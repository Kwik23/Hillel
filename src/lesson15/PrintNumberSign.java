package src.lesson15;

public class PrintNumberSign {
    public static void main(String[] args) {
        int number = -5;

        printNumberSign(number);
    }

    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Додатнє число");
        } else {
            System.out.println("Від'ємне число");
        }
    }
}
