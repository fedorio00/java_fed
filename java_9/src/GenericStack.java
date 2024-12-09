import java.util.Arrays;
import java.util.EmptyStackException;

public class GenericStack<E> {
    // Массив для хранения элементов стека
    private E[] elements;

    // Текущая позиция вершины стека
    private int top = -1;

    // Конструктор по умолчанию создает стек с начальным размером 10
    public GenericStack() {
        this.elements = (E[]) new Object[10];
    }

    // Метод для получения текущего размера стека
    public int getSize() {
        return top + 1;
    }

    // Проверка, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    // Метод для просмотра верхнего элемента без удаления
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    // Метод для добавления элемента в стек
    public void push(E element) {
        // Если текущий массив заполнен, удваиваем его размер
        if (top == elements.length - 1) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        // Помещаем элемент в стек и увеличиваем индекс вершины
        elements[++top] = element;
    }

    // Метод для извлечения элемента из стека
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        // Извлекаем верхний элемент и уменьшаем индекс вершины
        return elements[top--];
    }

    // Перегруженный метод toString для отображения содержимого стека
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]).append(", ");
        }
        return "Стек: [" + sb.substring(0, Math.max(sb.length() - 2, 0)) + "]";
    }
}
