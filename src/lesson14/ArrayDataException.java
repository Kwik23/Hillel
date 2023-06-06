package src.lesson14;

public class ArrayDataException extends Exception {
    private int row;
    private int column;

    public ArrayDataException(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
