import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack<String> stack = new GenericStack<>();

        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Содержимое стека в обратном порядке:");
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
