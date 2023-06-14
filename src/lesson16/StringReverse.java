package src.lesson16;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = stringReverse(input);
        System.out.println("Reversed string: " + reversed);
    }

    public static String stringReverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
