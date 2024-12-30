package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstraToAsk {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(#|\\|)(?<itemName>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1");
        Matcher matcher = pattern.matcher(text);

        List<String> item = new ArrayList<>();

        int sumOfCalories = 0;
        while (matcher.find()){
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            sumOfCalories += calories;
            String output = String.format("Item: %s, Best before: %s, Nutrition: %d",itemName,expirationDate,calories);

            item.add(output);
        }
        System.out.printf("You have food to last you for: %d days!%n",sumOfCalories/2000);
        for (String string : item) {
            System.out.println(string);
        }




    }
}
