package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String , Integer> result = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("stop")){

            int quantity = Integer.parseInt(scanner.nextLine());

            if (result.containsKey(command)){

               int currentQuantity =  result.get(command);
               result.put(command,currentQuantity + quantity);

            }else {
                result.put(command,quantity);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String ,Integer> kvp : result.entrySet()) {
            System.out.printf("%s -> %d%n",kvp.getKey(),kvp.getValue());
        }


    }
}
