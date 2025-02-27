package MidExamPrep;

import java.util.Scanner;

public class _01_GuineaPig {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double hayQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double coverQuantity = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeight = Double.parseDouble(scanner.nextLine()) * 1000;

        int days = 30;

        for (int i = 1; i <= days ; i++) {
            foodQuantity -= 300;
            if (i % 2 == 0){
                hayQuantity -= (5.00 / 100 * foodQuantity);
            }
            if (i % 3 == 0) {
                coverQuantity -= (pigWeight * 1 / 3);
            }
        }

        if (foodQuantity>= 0 && hayQuantity >= 0 && coverQuantity >= 0){
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodQuantity / 1000 ,hayQuantity/1000 ,coverQuantity/1000 );
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}