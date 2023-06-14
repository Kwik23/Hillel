package src.lesson16;

public class IsPalindrome {
    public static void main(String[] args) {
        String str1 = "ERE";
        String str2 = "Allo";

        System.out.println(str1 + " is a palindrome? " + isPalindrome(str1));
        System.out.println(str2 + " is a palindrome? " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String str) {
        String reversed = stringReverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    public static String stringReverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
