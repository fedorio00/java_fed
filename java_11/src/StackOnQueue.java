import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    // Метод добавления элемента в стек
    public void push(int x) {
        if (!queue1.isEmpty()) {
            queue1.offer(x);
        } else {
            queue2.offer(x);
        }
    }

    // Метод удаления и извлечения верхнего элемента из стека
    public int pop() {
        if (empty()) {
            throw new RuntimeException("Стек пустой");
        }

        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            return queue1.poll();
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            return queue2.poll();
        }
    }

    // Метод получения верхнего элемента без удаления
    public int top() {
        if (empty()) {
            throw new RuntimeException("Стек пустой");
        }

        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int result = queue1.peek(); // Получаем верхний элемент
            queue2.offer(queue1.poll()); // Перемещаем его обратно
            return result;
        } else {
            while (queue2.size() > 1) {
                queue1.offer(queue2.poll());
            }
            int result = queue2.peek(); // Получаем верхний элемент
            queue1.offer(queue2.poll()); // Перемещаем его обратно
            return result;
        }
    }

    // Проверка на пустоту стека
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }

    // Строковое представление всех элементов стека
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (!queue1.isEmpty()) {
            for (int i : queue1) {
                sb.append(i).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()).append("]");
        } else if (!queue2.isEmpty()) {
            for (int i : queue2) {
                sb.append(i).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length()).append("]");
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
