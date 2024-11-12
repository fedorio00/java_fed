import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в китайских юанях: ");
        int yuan = input.nextInt();
        double roubles1 = ROUBLES_PER_YUAN * yuan;

        int roubles = (int) Math.ceil(roubles1);
        System.out.println("Сумма = " + roubles);
        int lastDigit = roubles % 10;
        int lastTwoDigits = roubles % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 19) {
            System.out.print(lastDigit + " рублей");
        } else if (lastDigit == 1) {
            System.out.print(lastDigit + " рубль");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.print(lastDigit + " рубля");
        } else {
            System.out.print(lastDigit + " рублей");
        }

        lastDigit = yuan % 10;
        lastTwoDigits = yuan % 100;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            System.out.println(" " + yuan + " китайских юаней");
        } else if (lastDigit == 1) {
            System.out.println(" " + yuan + " юань");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println(" " + yuan + " юаня");
        } else {
            System.out.println(" " + yuan + " китайских юаней");
        }

        input.close();
    }
}