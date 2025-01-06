package DataTypesAndVariables;

import java.util.Scanner;

public class _01_ConvertMetersToKilometers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        double kilometers = meters * 0.001;
        System.out.printf("%.2f",kilometers);
    }
}
