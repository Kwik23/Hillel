package src.lesson10;

import java.util.ArrayList;
import java.util.List;

public class ArrayToListConverter {
    public static <T> List<T> toList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println("Array: " + java.util.Arrays.toString(array));
        System.out.println("List: " + list);
    }
}
