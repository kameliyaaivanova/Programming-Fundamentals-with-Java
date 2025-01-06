package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _08_MathPower {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(pow(number1, power)));

    }

    public static double pow(double number1, int power) {
        double result = 1;

        for (int i = 0; i < power; i++) {
            result *= number1;
        }

        return result;
    }
}