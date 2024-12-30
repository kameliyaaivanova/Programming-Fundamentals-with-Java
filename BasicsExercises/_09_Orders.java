package BasicsExercises;

import java.util.Scanner;

public class _09_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= countOfOrders ; i++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double price = ((days * capsulesCount)* pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f%n",price);
            totalPrice += price;
        }

        System.out.printf("Total: $%.2f",totalPrice);


    }
}
