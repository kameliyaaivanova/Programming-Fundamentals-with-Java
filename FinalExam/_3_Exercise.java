package FinalExam;

import java.util.*;

public class _3_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> animalFood = new LinkedHashMap<>();
        Map<String, List<String>> animalLivingArea = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("EndDay")){

            String[] commandParts = command.split(": ");
            String commandName = commandParts[0];
            String secondPart = commandParts[1];
            String[] secondPartAsArray = secondPart.split("-");
            String animalName = secondPartAsArray[0];
            int neededFoodQuantity = Integer.parseInt(secondPartAsArray[1]);

            switch (commandName){
                case "Add":
                    String area = secondPartAsArray[2];

                    if (animalFood.containsKey(animalName)){
                        int currentFood = animalFood.get(animalName);
                        currentFood += neededFoodQuantity;
                        animalFood.put(animalName,currentFood);
                    } else {
                        animalFood.put(animalName,neededFoodQuantity);
                        animalLivingArea.get(animalName).add(area);
                    }
                    break;
                case "Feed":
                    if (!animalFood.containsKey(animalName)){
                        break;
                    }else {
                        int currentFoodQuantity = animalFood.get(animalName);
                        currentFoodQuantity -= neededFoodQuantity;

                        if (currentFoodQuantity <= 0){
                            animalFood.remove(animalName);
                            animalLivingArea.remove(animalName);
                            System.out.printf("%s was successfully fed%n",animalName);
                        } else {
                            animalFood.put(animalName,currentFoodQuantity);
                        }
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.println("Animals: ");
        for (Map.Entry<String,Integer> entry : animalFood.entrySet()){
            String name = entry.getKey();
            int foodQuantity = entry.getValue();
            System.out.printf("%s -> %dg%n",name,foodQuantity);
        }

        System.out.println("Areas with hungry animals: ");
        for (Map.Entry<String,List<String>> animal : animalLivingArea.entrySet()){

        }
    }
}
