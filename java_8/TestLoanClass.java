import java.util.Scanner;

public class TestLoanClass {




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        System.out.println("Введите число от 1 до 12: ");
        int data = input.nextInt();


        try {
            if (data >= 1 && data <= 12){
                if (data == 2) {
                    System.out.println("Введите год: ");
                    int year = input.nextInt();

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        System.out.println("Високосный год");
                        System.out.println("Введенное вами число соответствует месяцу: " + months[data -1] + "\n" + "Кол-во дней: " + (dom[data - 1] + 1) + "\n" + "Год: " + year );
                    }

                    else if((year%4 != 0 && year%100 == 0) || (year%400 != 0)){
                        System.out.println("Невисокосный год");
                        System.out.println("Введенное вами число соответствует месяцу: " + months[data -1] + "\n" + "Кол-во дней: " + dom[data - 1] + "\n" +  "Год: " + year );
                    }
                }
                else {
                    System.out.println("Введенное вами число соответствует месяцу: " + months[data -1] + "\n" + "Кол-во дней: " + dom[data - 1]);
                }
            }
            else {
                throw new ArrayIndexOutOfBoundsException("Недопустимое число " + "\n");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Попытка доступа к элементу за пределами границ массива: " + e.getMessage());
        }


        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку, например, 8.25: ");
        double annualInterestRate = input.nextDouble();

        // Получить срок кредита в годах
        System.out.print("Введите срок кредита в годах: ");
        int numberOfYears = input.nextInt();

        // Получить сумму кредита
        System.out.print("Введите сумму кредита в руб., например, 120000.95: ");
        double loanAmount =  input.nextDouble();

        // Создать объект типа Loan
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Отобразить дату взятия, ежемесячный платеж и общую стоимость кредита
        System.out.println("Дата взятия кредита: " + loan.getLoanDate().toString());
        System.out.println("Ежемесячный платеж по кредиту равен "
                + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита равна "
                + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");


    }
}