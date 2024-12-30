package FinalExam;

import java.util.*;

public class _07_3PlantDiscovery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> plantRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantRating = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String plantInformation = scanner.nextLine();
            String[] plantInformationAsArray = plantInformation.split("<->");
            String plantName = plantInformationAsArray[0];
            int numberOfPlants = Integer.parseInt(plantInformationAsArray[1]);
            plantRarity.put(plantName,numberOfPlants);
            plantRating.putIfAbsent(plantName,new ArrayList<>());

        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){
            if (command.contains("Rate")){
                String plantNameWithCommand = command.split(" - ")[0];
                String plantName = plantNameWithCommand.split(": ")[1];
                double rating = Double.parseDouble(command.split(" - ")[1]);
                if (!plantRating.containsKey(plantName)){
                    System.out.println("error");
                }else {
                    plantRating.get(plantName).add(rating);
                }

            } else if (command.contains("Update")) {
                String plantNameWithCommand = command.split(" - ")[0];
                String plantName = plantNameWithCommand.split(": ")[1];
                int newRarity = Integer.parseInt(command.split(" - ")[1]);
                if (!plantRarity.containsKey(plantName)){
                    System.out.println("error");
                } else {
                    plantRarity.put(plantName,newRarity);
                }

            } else if (command.contains("Reset")) {
                String plantName = command.split(": ")[1];
                if (!plantRating.containsKey(plantName)){
                    System.out.println("error");
                }else {
                    plantRating.get(plantName).clear();

                }

            }


            command = scanner.nextLine();

        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String,Integer> kvp : plantRarity.entrySet()) {
            String plantName = kvp.getKey();
            int rarity = kvp.getValue();
            double averageRating = plantRating.get(plantName).stream().mapToDouble(a->a).average().orElse(0.00);

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        }
    }
}
