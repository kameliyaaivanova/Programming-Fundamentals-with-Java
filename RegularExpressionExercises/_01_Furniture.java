package RegularExpressionExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> furnitureNames = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {

            Pattern pattern = Pattern.compile(">>(?<name>[A-Za-z]+)<<(?<price>[\\d]+\\.?[0-9]*)!(?<quantity>[\\d]+)");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String name = matcher.group("name");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureNames.add(name);
                double currentPrice = price * quantity;
                totalPrice += currentPrice;

            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String furnitureName : furnitureNames) {
            System.out.println(furnitureName);
        }
        System.out.printf("Total money spend: %.2f%n", totalPrice);
    }
}