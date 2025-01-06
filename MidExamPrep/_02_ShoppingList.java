package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> products = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Go Shopping!")){
            if (command.contains("Urgent")){
                String urgentItem = (command.split(" ")[1]);
               if (!products.contains(urgentItem)){
                   products.add(0,urgentItem);
               }
            } else if (command.contains("Unnecessary")) {
                String unnecessaryItem = command.split(" ")[1];
                products.remove(unnecessaryItem);
            } else if (command.contains("Correct")) {
                String oldItem = command.split(" ")[1];
                String newItem = command.split(" ")[2];
                if (products.contains(oldItem)){
                   int indexOldItem = products.indexOf(oldItem);
                    products.set(indexOldItem,newItem);
                }
            } else if (command.contains("Rearrange")) {
                String rearrangeItem = command.split(" ")[1];
                if (products.contains(rearrangeItem)){
                    products.remove(rearrangeItem);
                    products.add(rearrangeItem);
                }
            }
            command = scanner.nextLine();
        }
        System.out.print(products.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll("!", ","));
    }
}