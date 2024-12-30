package MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _17_NewTreasureHunt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String command = input.split(" ")[0];

            switch (command){
                case "Loot":
                    String[] words = input.split(" ");
                    for (int i = 1; i < words.length; i++) {
                        String currentString = words[i];
                        if (!items.contains(currentString)){
                            items.add(0,currentString);
                        }
                    }
                    break;
                case "Drop":
                    int currentIndex = Integer.parseInt(input.split(" ")[1]);
                    if (currentIndex >= 0 && currentIndex < items.size()){
                        String currentNum = items.remove(currentIndex);
                        items.add(currentNum);
                    }
                    break;
                case "Steal":
                    int stealCount = Integer.parseInt(input.split(" ")[1]);

                    int result = items.size() - stealCount;
                    List<String> newItems = new ArrayList<>();
                    if (result >= 0) {
                        for (int i = result; i < items.size(); i++) {
                            String item = items.remove(i--);
                            newItems.add(item);
                        }
                    } else {
                        for (int i = 0; i < items.size(); i++) {
                            String item = items.remove(i--);
                            newItems.add(item);
                        }
                    }

                    System.out.println(String.join(", ", newItems));
                    break;
            }
            input = scanner.nextLine();
        }

        if (items.isEmpty()){
            System.out.println("Failed treasure hunt.");
        } else {
            int count = 0;
            int sumOfLength = 0;
            for (String item : items) {
                sumOfLength += item.length();
                count++;
            }
            double averageGain =  ((double) sumOfLength) / count;
            System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
        }
    }
}

