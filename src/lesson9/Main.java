package src.lesson9;

public class Main {
    public static void main(String[] args) {
        StringCollection collection = new StringCollection();
        collection.add("Hello");
        collection.add("World");
        collection.add("!");
        System.out.println("Size: " + collection.size());
        System.out.println("Element at index 1: " + collection.get(1));
        System.out.println("Contains 'Hello': " + collection.contain("Hello"));
        System.out.println("Contains 'Java': " + collection.contain("Java"));
        collection.add(1, "Java");
        System.out.println("Element at index 1 after insertion: " + collection.get(1));
        System.out.println("Size after insertion: " + collection.size());
        collection.delete("World");
        System.out.println("Contains 'World' after deletion: " + collection.contain("World"));
        System.out.println("Size after deletion: " + collection.size());
        collection.clear();
        System.out.println("Size after clearing: " + collection.size());
    }
}

