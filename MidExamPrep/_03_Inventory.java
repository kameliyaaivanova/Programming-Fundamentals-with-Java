package MidExamPrep;

import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_Inventory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Craft!")){

            if (command.contains("Collect")){
                String collectItem = command.split(" ")[2];
                if (!items.contains(collectItem)){
                    items.add(collectItem);
                }

            }else if (command.contains("Drop")){
                String dropItem = command.split(" ")[2];
                if (items.contains(dropItem)){
                    items.remove(dropItem);
                }

            } else if (command.contains("Combine")) {
                String[] split = command.split(" - ");

                String action = split[0];
                String current_items = split[1];

                String oldItem = current_items.split(":")[0];
                String newItem = current_items.split(":")[1];

                if (items.contains(oldItem)){
                    int indexOldItem = items.indexOf(oldItem);
                    items.add(indexOldItem + 1, newItem);
                }

            } else if (command.contains("Renew")) {
                String renewItem = command.split(" ")[2];
                if (items.contains(renewItem)){
                    items.remove(renewItem);
                    items.add(renewItem);
                }
            }
            command = scanner.nextLine();
        }

        System.out.print(items.toString()
                .replace("[", "")
                .replace("]", ""));




    }
}
