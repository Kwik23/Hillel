package src.lesson16;

public class FindSymbolOccurrence {

        public static void main(String[] args) {
            String str = "Hello, world!";
            char symbol = 'o';

            int occurrence = findSymbolOccurrence(str, symbol);
            System.out.println("Symbol '" + symbol + "' occurs " + occurrence + " times in the string.");
        }

        public static int findSymbolOccurrence(String str, char symbol) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == symbol) {
                    count++;
                }
            }
            return count;
        }
    }
