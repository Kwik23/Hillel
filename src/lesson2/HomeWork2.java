package src.lesson2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        double [] array = {10,20,30};
        double sum = Arrays.stream(array).sum() / array.length;
        System.out.println("Arithmetic mean=" + sum);
    }

}
