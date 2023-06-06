package src.lesson14;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = doCalc(array);
            System.out.println("Результат обчислення: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Помилка: неправильний розмір масиву!");
        } catch (ArrayDataException e) {
            System.out.println("Помилка: некоректні дані в комірці " + e.getRow() + ", " + e.getColumn() + "!");
        }
    }

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;

        if (array.length != 4 || array[0].length != 4) {
            throw new ArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int value = Integer.parseInt(array[i][j]);
                    sum += value;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }
            }
        }

        return sum;
    }
}
