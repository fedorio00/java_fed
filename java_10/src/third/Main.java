import second.MyStack;

import java.util.Scanner;


public void main() {
    int n = 1;
    Scanner scanner = new Scanner(System.in);
    second.MyStack stack = new MyStack();

    while (n == 1){
        System.out.println("1 - ввести 5 строк и вывести строки в обратном порядке");

        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                for (int i = 0; i < 6; i++){
                    stack.push(scanner.nextLine());


                }
                while (!stack.isEmpty()){
                    System.out.println(stack.pop());

                }

        }

    }
}
