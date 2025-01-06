package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _15_6_Pirates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,Integer> citiesPopulation = new LinkedHashMap<>();
        Map<String,Integer> citiesGold = new LinkedHashMap<>();

        while (!input.equals("Sail")){
            String[] inputAsArray = input.split("\\|\\|");
            String city = inputAsArray[0];
            int population = Integer.parseInt(inputAsArray[1]);
            int gold = Integer.parseInt(inputAsArray[2]);

            if (citiesPopulation.containsKey(city)){
                int currentPopulation = citiesPopulation.get(city);
                int newPopulation = currentPopulation + population;
                citiesPopulation.put(city,newPopulation);
            } else {
                citiesPopulation.put(city,population);
            }

            if (citiesGold.containsKey(city)){
                int currentGold = citiesGold.get(city);
                int newGold = currentGold + gold;
                citiesGold.put(city,newGold);
            } else {
                citiesGold.put(city,gold);
            }
            input = scanner.nextLine();
        }

        String secondInput = scanner.nextLine();

        while (!secondInput.equals("End")){
            String[] inputAsArray = secondInput.split("=>");
            String actions = inputAsArray[0];
            String cityToAttack = inputAsArray[1];
            switch (actions){
                case "Plunder":
                    int peopleToAttack = Integer.parseInt(inputAsArray[2]);
                    int goldToSteal = Integer.parseInt(inputAsArray[3]);
                    int currentPopulation = citiesPopulation.get(cityToAttack);
                    int newPopulation = currentPopulation - peopleToAttack;
                    citiesPopulation.put(cityToAttack,newPopulation);
                    int currentGold = citiesGold.get(cityToAttack);
                    int newGold = currentGold - goldToSteal;
                    citiesGold.put(cityToAttack,newGold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",cityToAttack,goldToSteal,peopleToAttack);

                    if (newPopulation == 0 || newGold == 0){
                        citiesGold.remove(cityToAttack);
                        citiesPopulation.remove(cityToAttack);
                        System.out.printf("%s has been wiped off the map!%n",cityToAttack);
                    }
                    break;
                case "Prosper":
                    int gold = Integer.parseInt(inputAsArray[2]);
                    int currentAmountOfGold = citiesGold.get(cityToAttack);

                    if (gold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        int newAmountOfGold = currentAmountOfGold + gold;
                        citiesGold.put(cityToAttack, newAmountOfGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",gold,cityToAttack,newAmountOfGold);
                    }
                    break;
            }
            secondInput = scanner.nextLine();
        }
        if (!citiesPopulation.isEmpty()){
            int existingSettlements = citiesPopulation.size();
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",existingSettlements);

            for (Map.Entry<String,Integer> entry : citiesPopulation.entrySet()){
                String currentCity = entry.getKey();
                int currentPopulation = entry.getValue();
                int currentGold = citiesGold.get(currentCity);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",currentCity,currentPopulation,currentGold);
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}