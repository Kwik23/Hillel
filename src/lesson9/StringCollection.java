package src.lesson9;

public class StringCollection implements Collection {
    private String[] array;
    private int size;

    public StringCollection() {
        array = new String[10];
        size = 0;
    }

    public boolean add(String o) {
        if (size == array.length) {
            expandArray();
        }
        array[size++] = o;
        return true;
    }

    public boolean add(int index, String o) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            expandArray();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = o;
        size++;
        return true;
    }

    public boolean delete(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[--size] = null;
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    public boolean contain(String o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Collection str) {
        if (size != str.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!array[i].equals(str.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        return true;
    }

    public int size() {
        return size;
    }

    private void expandArray() {
        int newCapacity = array.length * 2;
        String[] newArray = new String[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }
}
