package Methods;

import java.util.Scanner;

public class _05_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if (product.equals("coffee")){
            productCoffee(quantity);
        } else if (product.equals("water")) {
            productWater(quantity);
        } else if (product.equals("coke")) {
            productCoke(quantity);
        } else if (product.equals("snacks")) {
            productSnacks(quantity);
        }
    }

    public static void productCoffee (int quantity){
        double price = quantity * 1.50;
        System.out.printf("%.2f",price);
    }

    public static void productWater(int quantity){
        double price = quantity * 1.00;
        System.out.printf("%.2f",price);
    }

    public static void productCoke(int quantity){
        double price = quantity * 1.40;
        System.out.printf("%.2f",price);
    }

    public static void productSnacks(int quantity){
        double price = quantity * 2.00;
        System.out.printf("%.2f",price);
    }
}