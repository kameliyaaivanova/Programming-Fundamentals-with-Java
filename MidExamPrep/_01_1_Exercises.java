package MidExamPrep;

import java.util.Scanner;

public class _01_1_Exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int daysOfTheAdventure = Integer.parseInt(scanner.nextLine());
        int numberOfPlayers = Integer.parseInt(scanner.nextLine());
        double groupEnergy = Double.parseDouble(scanner.nextLine());
        double waterPerDayFor1Person = Double.parseDouble(scanner.nextLine());
        double foodPerDayFor1Person = Double.parseDouble(scanner.nextLine());

        double waterForTheHoleGroup = numberOfPlayers * waterPerDayFor1Person * daysOfTheAdventure;
        double foodForTheHoleGroup = numberOfPlayers * foodPerDayFor1Person * daysOfTheAdventure;

        for (int i = 1; i <= daysOfTheAdventure ; i++) {
            double energyLossFor1Day = Double.parseDouble(scanner.nextLine());
            groupEnergy -= energyLossFor1Day;

            if (groupEnergy <= 0){
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.%n",foodForTheHoleGroup,waterForTheHoleGroup);
                return;
            }

            if (i % 2 == 0){
                double boostEnergy = groupEnergy * 0.05;
                groupEnergy += boostEnergy;

                double dropWaterSupplies = waterForTheHoleGroup * 0.3;
                waterForTheHoleGroup -= dropWaterSupplies;

            }

            if (i % 3 == 0){
                double foodReduce = foodForTheHoleGroup / numberOfPlayers ;
                foodForTheHoleGroup -= foodReduce;

                double energyRaises = groupEnergy * 0.1;
                groupEnergy += energyRaises;

            }
        }

        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!",groupEnergy);

    }
}
