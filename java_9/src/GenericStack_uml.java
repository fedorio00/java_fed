import java.util.Arrays;
import java.util.EmptyStackException;

class GenericStack_uml<E> {
    E[] elements;
    int top = -1;

    GenericStack_uml() {
        elements = (E[]) new Object[10];
    }

    int getSize() {
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top];
    }

    void push(E element) {
        if (top == elements.length - 1) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[++top] = element;
    }

    E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[top--];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append(elements[i]).append(", ");
        }
        return "Стек: [" + sb.substring(0, Math.max(sb.length() - 2, 0)) + "]";
    }
}
