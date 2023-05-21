package src.lesson8;

public class Main {
    public static void main(String[] args) {
        DynamicStringArray collection = new DynamicStringArray();

        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        System.out.println(collection.get(0)); // Выводит "One"
        System.out.println(collection.get(2)); // Выводит "Three"

        collection.delete(1);

        System.out.println(collection.get(1)); // Выводит "Three"

        collection.add(1, "New");

        System.out.println(collection.get(1)); // Выводит "New"
    }
}