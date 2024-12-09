import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main extends functions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            System.out.println("1 - ввести коллекцию и удалить дубликаты");
            System.out.println("2 - ввести массив и найти элемент");
            System.out.println("3 - ввести массив и найти наибольший элемент");
            System.out.println("4 - ввести двумерный массив и найти наибольший элемент");
            System.out.println("5 - Generic stack");
            System.out.println("6 - Extended stack");

            int n = scan.nextInt();
            switch (n) {
                case 1:

                    System.out.println("Ведите количество объектов для ArrayList: ");
                    int input = scan.nextInt();
                    scan.nextLine();// пропуск строки и очистка буфера;

                    ArrayList<String> inputList = new ArrayList<>();
                    for (int i = 0; input > i; i++) {
                        String inputWord = scan.nextLine();
                        inputList.add(inputWord);
                    }
                    System.out.println("Исходный список: " + inputList);
                    System.out.println("Список без дубликатов:" + removeDuplicates(inputList));

                    break;
                case 2:
                    System.out.println("Введите количество элементов для числового массива: ");
                    int qNum2 = scan.nextInt();
                    Integer[] intArray2 = new Integer[qNum2];

                    for (int i = 0; i < qNum2; i ++){
                        int inputInt2 = scan.nextInt();
                        intArray2[i] = inputInt2;
                    }
                    System.out.println("Введите искомый элемент: ");
                    int targetNum = scan.nextInt();
                    System.out.println("Индекс искомого элемента: " + search(intArray2, targetNum));


                    System.out.println("Введите количество элементов для буквенного массива: ");
                    int qString2 = scan.nextInt();
                    scan.nextLine();// читаем и игнорируем остаток строки, очистка буфера

                    String[] stringArray2 = new String[qString2];
                    for(int i = 0; i < qString2; i++){
                        String inputString2 = scan.nextLine();
                        stringArray2[i] = inputString2;

                    }
                    System.out.println("Введите искомый элемент: ");
                    String targetString = scan.nextLine();
                    System.out.println("Индекс искомого элемента: " + search(stringArray2, targetString));
                    
                    break;

                case 3:
                    ArrayList<Circle> circles = new ArrayList<>();

                    circles.add(new Circle(10));
                    circles.add(new Circle(20));
                    circles.add(new Circle(15));
                    circles.add(new Circle(25));
                    circles.add(new Circle(30));

                    // Находим максимальный элемент массива
                    Circle maxCircle = Collections.max(circles);
                    System.out.println("Максимальный радиус: " + maxCircle.getRadius());

                    break;

                case 4:
                    // Создание двумерного массива целых чисел
                    Integer[][] integers = {
                            {4, 7, 9},
                            {6, 8, 12},
                            {11, 13, 14}
                    };

                    // Поиск наибольшего элемента
                    Integer maxInteger = findMax(integers);
                    System.out.println("Наибольший элемент: " + maxInteger);

                    // Создание двумерного массива строк
                    String[][] strings = {
                            {"apple", "banana", "cherry"},
                            {"date", "fig", "grape"},
                            {"lemon", "mango", "orange"}
                    };

                    // Поиск наибольшей строки (по алфавиту)
                    String maxString = findMax(strings);
                    System.out.println("Наибольшая строка: " + maxString);

                case 5:
                            // Создание экземпляра стека для хранения целых чисел
                            GenericStack<Integer> stack = new GenericStack<>();

                            // Заполнение стека числами
                            stack.push(1);
                            stack.push(2);
                            stack.push(3);
                            stack.push(4);
                            stack.push(5);

                            // Вывод текущего состояния стека
                            System.out.println("Текущее состояние стека: " + stack);

                            // Просмотр верхнего элемента без удаления
                            Integer topElement = stack.peek();
                            System.out.println("Верхний элемент стека: " + topElement);

                            // Удаление двух верхних элементов
                            Integer removedElement1 = stack.pop();
                            Integer removedElement2 = stack.pop();

                            System.out.println("Удалено два элемента: " + removedElement1 + ", " + removedElement2);

                            // Вывод обновленного состояния стека
                            System.out.println("Обновленное состояние стека: " + stack);

                            // Проверка, является ли стек пустым
                            if (stack.isEmpty()) {
                                System.out.println("Стек пуст.");
                            } else {
                                System.out.println("Стек не пуст. Размер: " + stack.getSize());
                            }

                case 6:
                    // Создаем экземпляр стека для целых чисел
                    ExtendedStack<Integer> integerStack = new ExtendedStack<>();

                    // Проверка push/pop
                    System.out.println("\nПроверка методов push и pop:");
                    integerStack.push(10);
                    integerStack.push(20);
                    integerStack.push(30);
                    System.out.println(integerStack); // Стек: [10, 20, 30]

                    try {
                        System.out.println("Попытка извлечь элемент: " + integerStack.pop()); // 30
                        System.out.println("Попытка извлечь элемент: " + integerStack.pop()); // 20
                        System.out.println("Попытка извлечь элемент: " + integerStack.pop()); // 10
                        System.out.println("Попытка извлечь элемент из пустого стека: " + integerStack.pop()); // Исключение
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage()); // Стек пуст
                    }

                    // Проверка peek
                    System.out.println("\nПроверка метода peek:");
                    integerStack.push(40);
                    integerStack.push(50);
                    System.out.println(integerStack); // Стек: [40, 50]

                    try {
                        System.out.println("Просмотр верхнего элемента: " + integerStack.peek()); // 50
                        System.out.println("Попытка просмотреть элемент из пустого стека: " + integerStack.peek()); // Исключение
                    } catch (NoSuchElementException e) {
                        System.out.println(e.getMessage()); // Стек пуст
                    }

                    // Проверка toString
                    System.out.println("\nПроверка метода toString:");
                    integerStack.push(60);
                    integerStack.push(70);
                    System.out.println(integerStack); // Стек: [40, 50, 60, 70]

                    integerStack.pop();
                    integerStack.pop();
                    System.out.println(integerStack); // Стек: [40, 50]

                    integerStack.pop();
                    integerStack.pop();
                    System.out.println(integerStack); // Стек: []



            }

                        }

                    }

                }

class Circle implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }

}
