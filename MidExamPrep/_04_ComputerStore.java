package MidExamPrep;

import java.util.Scanner;

public class _04_ComputerStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();
       double totalPriceWithTaxes = 0;
       double totalPriceWithoutTaxes = 0;

       while (!input.equals("special") && !input.equals("regular")){
           double price = Double.parseDouble(input);

           if (price < 0){
               System.out.println("Invalid price!");
           } else {
               totalPriceWithTaxes += price + (price* 0.2);
               totalPriceWithoutTaxes += price;
           }

           input = scanner.nextLine();
       }
       double taxes = (totalPriceWithoutTaxes * 0.2);

       if (totalPriceWithTaxes == 0){
           System.out.println("Invalid order!");
           return;

       }
       if (input.equals("special")){
           totalPriceWithTaxes = totalPriceWithTaxes - (totalPriceWithTaxes * 0.1) ;
           System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$",totalPriceWithoutTaxes,taxes,totalPriceWithTaxes);

       } else {
           System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$",totalPriceWithoutTaxes,taxes,totalPriceWithTaxes);


       }
    }
}
