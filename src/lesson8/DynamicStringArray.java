package src.lesson8;

    public class DynamicStringArray {
        private String[] array;
        private int size;

        public DynamicStringArray() {
            array = new String[10]; // Начальный размер массива
            size = 0; // Изначально коллекция пуста
        }

        public boolean add(int index, String value) {
            if (index < 0 || index > size) {
                return false; // Некорректный индекс
            }

            if (size == array.length) {
                resizeArray(); // Если массив заполнен, увеличиваем его размер
            }

            // Сдвигаем элементы массива вправо, чтобы освободить место для нового элемента
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }

            array[index] = value; // Вставляем новый элемент на заданную позицию
            size++; // Увеличиваем размер коллекции
            return true;
        }

        public boolean add(String value) {
            return add(size, value); // Добавляем элемент в конец коллекции
        }

        public boolean delete(int index) {
            if (index < 0 || index >= size) {
                return false; // Некорректный индекс
            }

            // Сдвигаем элементы массива влево, чтобы удалить заданный элемент
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }

            array[size - 1] = null; // Удаляем последний элемент
            size--; // Уменьшаем размер коллекции
            return true;
        }

        public boolean delete(String value) {
            for (int i = 0; i < size; i++) {
                if (array[i] != null && array[i].equals(value)) {
                    return delete(i); // Удаляем первое вхождение заданного значения
                }
            }
            return false; // Значение не найдено
        }

        public String get(int index) {
            if (index < 0 || index >= size) {
                return null; // Некорректный индекс
            }
            return array[index];
        }

        private void resizeArray() {
            int newLength = array.length * 2; // Увеличиваем размер массива в два раза
            String[] newArray = new String[newLength];
            System.arraycopy(array, 0, newArray, 0, size); // Копируем элементы в новый массив
            array = newArray;
        }
    }

