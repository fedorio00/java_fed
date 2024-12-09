import java.util.ArrayList;
import java.util.NoSuchElementException;

class ExtendedStack_uml<E> extends ArrayList<E> {
    ExtendedStack_uml() {
        super();
    }

    int getSize() {
        return size();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return get(size() - 1);
    }

    void push(E element) {
        add(element);
    }

    E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Стек пуст");
        }
        return remove(size() - 1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(get(i)).append(", ");
        }
        return "Стек: [" + sb.substring(0, Math.max(sb.length() - 2, 0)) + "]";
    }
}
