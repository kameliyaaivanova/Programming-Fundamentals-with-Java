package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_2AdAstra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("([#|])(?<itemName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(input);
        StringBuilder food = new StringBuilder();
        int sumOfCalories = 0;

        while (matcher.find()){
            String itemName = matcher.group("itemName");
            String expirationDate = (matcher.group("expirationDate"));
            int calories = Integer.parseInt(matcher.group("calories"));
            sumOfCalories += calories;
            String output = String.format("Item: %s, Best before: %s, Nutrition: %d%n",itemName,expirationDate,calories);
            food.append(output);
        }
        int days = sumOfCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n",days);
        System.out.println(food);
    }
}