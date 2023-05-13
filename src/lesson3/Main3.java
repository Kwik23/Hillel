package src.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Task 1");
        forFrom1to99();
        System.out.println("Task 2");
        forFactorial(5);
        System.out.println("Task 3.1");
        whileFrom1to99();
        System.out.println("Task 3.2");
        whileFactorial(5);
        System.out.println("Task 4.1");
        doWhileFrom1to99();
        System.out.println("Task 4.2");
        doWhileFactorial(5);
        System.out.println("Task 5");
        degree(1, 2);
        System.out.println("Task 6");
        sequence();
        System.out.println("\nTask 7");
        table(2);
        System.out.println("Task 8");
        firstTenOddNumber();
        System.out.println("\nTask 9");
        randomArray(10);

    }

    private static void forFrom1to99() {
        for (int i = 1; i <= 99; i++) {
            if (i != 2) {
                System.out.println(i);
            }
        }
    }

    private static void forFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }

    private static void whileFrom1to99() {
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
    }

    private static void whileFactorial(int n) {
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }

    private static void doWhileFrom1to99() {
        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        } while (i <= 99);

    }

    private static void doWhileFactorial(int n) {
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= n);

        System.out.println(factorial);
    }

    private static void degree(int x, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println(result);
    }

    private static void sequence() {
        int n = 1;
        int num = 0;
        while (n <= 10) {
            System.out.print(num + " ");
            num -= 5;
            n++;
        }
    }

    private static void table(int n) {

        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n * i));
            i++;
        }
    }

    private static void firstTenOddNumber() {
        int[] oddNum = new int[10];

        for (int i = 0; i < 10; i++) {
            oddNum[i] = 2 * i + 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(oddNum[i]);
            if (i != 9) {
                System.out.print(", ");
            }
        }
    }

    private static void randomArray(int n) {

        int[] arr = generateRandomArray(n);
        printArray(arr);
        int minValue = findMinValue(arr);
        System.out.println("Min: " + minValue);
        int maxValue = findMaxValue(arr);
        System.out.println("Task 10\nMax: " + maxValue);
        sortAscending(arr);
        printArray(arr);
        sortDescending(arr);
        printArray(arr);
    }

    private static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    private static int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static void sortAscending(int[] arr) {
        Arrays.sort(arr);
        System.out.print("Task 11\nArray ascending: ");
    }

    private static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.print("Array descending: ");
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    private static void printArray(int[] arr) {
        System.out.print(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
