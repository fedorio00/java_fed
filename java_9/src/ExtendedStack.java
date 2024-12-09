import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ExtendedStack<E> extends ArrayList<E> {
    // Конструктор по умолчанию
    public ExtendedStack() {
        super();
    }

    // Метод для получения текущего размера стека
    public int getSize() {
        return size();
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // Метод для просмотра верхнего элемента без удаления
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return get(size() - 1);
    }

    // Метод для добавления элемента в стек
    public void push(E element) {
        add(element);
    }

    // Метод для извлечения элемента из стека
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return remove(size() - 1);
    }

    // Перегруженный метод toString для отображения содержимого стека
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(get(i)).append(", ");
        }
        return "Стек: [" + sb.substring(0, Math.max(sb.length() - 2, 0)) + "]";
    }
}
