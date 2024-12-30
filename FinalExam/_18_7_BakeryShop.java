package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _18_7_BakeryShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> foodQuantity = new LinkedHashMap<>();
       int soldQuantity = 0;

        String commands = scanner.nextLine();

        while (!commands.equals("Complete")){
            String[] commandParts = commands.split("\\s");
            String commandName = commandParts[0];
            int quantity = Integer.parseInt(commandParts[1]);
            String food = commandParts[2];

            switch (commandName){
                case "Receive":
                    if (quantity <= 0){
                        break;
                    }
                    foodQuantity.putIfAbsent(food,quantity);
                    if (!foodQuantity.containsKey(food)){
                        int currentQuantity = foodQuantity.get(food);
                        currentQuantity += quantity;
                        foodQuantity.put(food,currentQuantity);
                    }
                    break;
                case "Sell":
                    if (!foodQuantity.containsKey(food)){
                        System.out.printf("You do not have any %s.%n",food);
                        break;
                    }
                    int currentQuantity = foodQuantity.get(food);
                    if (currentQuantity < quantity){
                       soldQuantity += currentQuantity;
                        foodQuantity.remove(food);
                        System.out.printf("There aren't enough %s. You sold the last %d of them.%n",food,currentQuantity);
                    }else {
                        soldQuantity += quantity;
                        currentQuantity -= quantity;
                        System.out.printf("You sold %d %s.%n",quantity,food);
                        if (currentQuantity <= 0 ){
                            foodQuantity.remove(food);
                        }else {
                            foodQuantity.put(food,currentQuantity);
                        }
                    }
                    break;
            }
            commands = scanner.nextLine();
        }

        for (Map.Entry<String,Integer> entry : foodQuantity.entrySet()){
            String foodName = entry.getKey();
            int quantity = entry.getValue();
            System.out.printf("%s: %d%n",foodName,quantity);
        }
        System.out.printf("All sold: %d goods%n",soldQuantity);
    }
}
