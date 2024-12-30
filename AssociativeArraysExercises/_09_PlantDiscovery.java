package AssociativeArraysExercises;

import java.util.*;

public class _09_PlantDiscovery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> mapOfPlantsRarity = new LinkedHashMap<>();
        Map<String,List<Double>> mapOfPlantsRating = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String command = scanner.nextLine();
            String[] commandAsArray = command.split("<->");
            String plantName = commandAsArray[0];
            int rarity = Integer.parseInt(commandAsArray[1]);

            mapOfPlantsRarity.put(plantName,rarity);
            mapOfPlantsRating.putIfAbsent(plantName,new ArrayList<>());
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")){
            if (input.contains("Rate")){
                String plantName = input.split(" ")[1];
                double rating = Double.parseDouble(input.split(" ")[3]);

                if (mapOfPlantsRating.containsKey(plantName)){
                    mapOfPlantsRating.get(plantName).add(rating);
                }else {
                    System.out.println("error");

                }
            } else if (input.contains("Update")) {
                String plantName = input.split(" ")[1];
                int newRarity = Integer.parseInt(input.split(" ")[3]);

                if (mapOfPlantsRarity.containsKey(plantName)){
                    mapOfPlantsRarity.put(plantName,newRarity);
                }else {
                    System.out.println("error");
                }
                
            } else if (input.contains("Reset")) {
                String plantName = input.split(" ")[1];
                if (mapOfPlantsRating.containsKey(plantName)){
                    mapOfPlantsRating.get(plantName).clear();
                } else {
                    System.out.println("error");

                }            }


            input = scanner.nextLine();


        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String,Integer> kvp : mapOfPlantsRarity.entrySet()) {
            String plantName = kvp.getKey();
            int rarity = kvp.getValue();
            double averageRating = mapOfPlantsRating.get(plantName)
                    .stream().mapToDouble(a->a)
                    .average().orElse(0.0);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",plantName,rarity,averageRating);
        }

    }
}
