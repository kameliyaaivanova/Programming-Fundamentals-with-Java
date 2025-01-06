package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Orders {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> mapOfProductsQuantity = new LinkedHashMap<>();
        Map<String, Double> mapOfProductsPrices = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("buy")) {

            String[] inputAsArray = input.split(" ");
            String name = inputAsArray[0];
            double price = Double.parseDouble(inputAsArray[1]);
            int quantity = Integer.parseInt(inputAsArray[2]);

            if (!mapOfProductsQuantity.containsKey(name)) {
                mapOfProductsQuantity.put(name, quantity);
            } else {
                int currentQuantity = mapOfProductsQuantity.get(name);
                mapOfProductsQuantity.put(name, currentQuantity + quantity);
            }
            mapOfProductsPrices.put(name, price);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> product : mapOfProductsQuantity.entrySet()) {
            String currentProductName = product.getKey();
            double finalSum = mapOfProductsQuantity.get(currentProductName) * mapOfProductsPrices.get(currentProductName);
            System.out.printf("%s -> %.2f%n", currentProductName, finalSum);
        }
    }
}
