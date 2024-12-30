package BasicsExercises;

import java.util.Scanner;

public class _03_Vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (typeOfGroup.equals("Students")){

            if (day.equals("Friday")){
                price = numberOfGroup * 8.45;

            } else if (day.equals("Saturday")) {
                price = numberOfGroup * 9.80;

            } else if (day.equals("Sunday")) {
                price = numberOfGroup * 10.46;
            }

            if (numberOfGroup >= 30){
               double totalPrice  = price - (price * 0.15);
                System.out.printf("Total price: %.2f",totalPrice);
            } else {
                System.out.printf("Total price: %.2f",price);
            }

        } else if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")){
                if (numberOfGroup >= 100) {
                    price = (numberOfGroup - 10) * 10.90;
                } else {
                    price = numberOfGroup * 10.90;

                }
            } else if (day.equals("Saturday")) {
                if (numberOfGroup >= 100) {
                    price = (numberOfGroup - 10) * 15.60;
                } else {
                    price = numberOfGroup * 15.60;

                }

            } else if (day.equals("Sunday")) {
                if (numberOfGroup >= 100) {
                    price = (numberOfGroup - 10) * 16;
                } else {
                    price = numberOfGroup * 16;

                }
            }
            System.out.printf("Total price: %.2f",price);


        } else if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")){
                price = numberOfGroup * 15;

            } else if (day.equals("Saturday")) {
                price = numberOfGroup * 20;

            } else if (day.equals("Sunday")) {
                price = numberOfGroup * 22.50;
            }

            if (numberOfGroup >= 10 && numberOfGroup <= 20){
                double totalPrice = price - (price * 0.05);
                System.out.printf("Total price: %.2f",totalPrice);
            } else {
                System.out.printf("Total price: %.2f",price);
            }

        }


    }
}
