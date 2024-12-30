package Exercises;

import java.util.*;

public class _03_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> animalFoodQuantity = new LinkedHashMap<>();
        Map<String, List<String>> animalLivingArea = new LinkedHashMap<>();

        String commands = scanner.nextLine();

        while (!commands.equals("EndDay")){
            String[] commandParts = commands.split(": ");
            String commandName = commandParts[0];
            String animalInformation = commandParts[1];
            String animalName = animalInformation.split("-")[0];
            int food = Integer.parseInt(animalInformation.split("-")[1]);

            switch (commandName){
                case "Add":
                    String area = animalInformation.split("-")[2];
                    if (animalFoodQuantity.containsKey(animalName)){
                        int currentFoodQuantity = animalFoodQuantity.get(animalName);
                        currentFoodQuantity += food;
                        animalFoodQuantity.put(animalName,currentFoodQuantity);
                    } else {
                        animalFoodQuantity.put(animalName,food);
                        if (animalLivingArea.containsKey(area)){
                            animalLivingArea.get(area).add(animalName);
                        }else {
                            animalLivingArea.put(area, new ArrayList<>());
                            animalLivingArea.get(area).add(animalName);
                        }
                    }
                    break;

                case "Feed":
                    if (!animalFoodQuantity.containsKey(animalName)){
                        break;
                    }else {
                        int currentFood = animalFoodQuantity.get(animalName);
                        currentFood -= food;

                        if (currentFood <= 0){
                            animalFoodQuantity.remove(animalName);
                            for (Map.Entry<String,List<String>> entry: animalLivingArea.entrySet()){
                                String areaEntry = entry.getKey();
                                List<String> animalsInCurrentArea = entry.getValue();
                                if (animalsInCurrentArea.contains(animalName)) {
                                    animalsInCurrentArea.remove(animalName);
                                    animalLivingArea.put(areaEntry, animalsInCurrentArea);
                                }
                                if (animalsInCurrentArea.size() == 0) {
                                    animalLivingArea.remove(areaEntry);
                                }
                            }
                            System.out.printf("%s was successfully fed%n",animalName);

                        }else {
                            animalFoodQuantity.put(animalName,currentFood);
                        }
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        System.out.println("Animals: ");
        for (Map.Entry<String,Integer> entry : animalFoodQuantity.entrySet()){
            String name = entry.getKey();
            int food = entry.getValue();
            System.out.printf("%s -> %dg%n",name,food);
        }

        System.out.println("Areas with hungry animals:");
        for (Map.Entry<String,List<String>> entry : animalLivingArea.entrySet()){
            String nameArea = entry.getKey();
            List<String> animalsName = entry.getValue();
            int numberOfAnimals = animalsName.size();
            System.out.printf("%s -> %d%n",nameArea,numberOfAnimals);
        }



    }
}
