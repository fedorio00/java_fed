import java.util.ArrayList;
import java.util.List;

public class functions {
    public static <T> List<T> removeDuplicates(List<T> inputList) {
        // Создаем новый список для хранения уникальных элементов
        List<T> result = new ArrayList<>();

        for (T element : inputList) {
            if (!result.contains(element)) { // Проверяем наличие элемента в новом списке
                result.add(element);          // Если элемент еще не добавлен, добавляем его
            }
        }

        return result;
    }

    public static <T> int search(T[] array, T target) {
        // Перебираем элементы массива
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) {
                return i; // Возвращаем индекс найденного элемента
            }
        }

        return -1; // Элемент не найден
    }

    public static <T extends Comparable<T>> T findMax(T[][] array) {
        T max = null;
        for (T[] row : array) {
            for (T element : row) {
                if (max == null || element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }

}

