import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        System.out.println("Введите кол-во юаней, которое вам нужно");
        final double yuanprice = 11.91;
        Scanner input = new Scanner(System.in);
        double yuan = input.nextInt();
        double roubles = yuan * yuanprice;
        System.out.print(Math.round(roubles));
        input.close();
    }
}
