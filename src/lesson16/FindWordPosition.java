package src.lesson16;

public class FindWordPosition {
    public static void main(String[] args) {
        String source = "Apple";
        String target = "Plant";

        int position = findWordPosition(source, target);
        System.out.println("Result: " + position);
    }

    public static int findWordPosition(String source, String target) {
        int position = source.indexOf(target);
        return position != -1 ? position : -1;
    }
}
