package MidExamPrep;

import java.util.Scanner;

public class _13_BlackFlag {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double plunderSum = 0;

        for (int i = 1; i <= daysOfPlunder; i++) {
            plunderSum += dailyPlunder;

            if (i % 3 == 0) {
                double additionalProfit = dailyPlunder * 0.5;
                plunderSum += additionalProfit;
            }
            if (i % 5 == 0) {
                plunderSum -= plunderSum * 0.3;
            }
        }

        if (plunderSum >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderSum);
        } else {
            double percentageLeft = (plunderSum / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentageLeft);
        }
    }
}