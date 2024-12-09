import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackOnQueue stack = new StackOnQueue();

        System.out.print("Сколько элементов хотите добавить в стек? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d-й элемент: ", i + 1);
            int element = scanner.nextInt();
            stack.push(element);
        }

        System.out.println("\nТекущий стек: " + stack);

        System.out.println("\nВерхний элемент (без удаления): " + stack.top());

        System.out.println("\nУдаленный элемент: " + stack.pop());

        System.out.println("\nПроверка на пустоту: " + stack.empty());

        System.out.println("\nОставшиеся элементы: " + stack);

        scanner.close();
    }
}