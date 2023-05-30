package src.lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumberFinder {
    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueSet);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 3, 5, 6, 5, 7, 8, 7);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Unique List: " + uniqueNumbers);
    }
}
