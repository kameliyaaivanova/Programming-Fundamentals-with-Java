package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _18_ManOWar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")){
            
            if (input.contains("Fire")){
                int index = Integer.parseInt(input.split(" ")[1]);
                int damage = Integer.parseInt(input.split(" ")[2]);
                if (index >= 0 && index < warShip.size()){
                    int elementFromIndex = warShip.get(index);
                    if (elementFromIndex - damage <= 0){
                        System.out.println("You won! The enemy ship has sunken.");
                        return;
                    } else {
                        int newElement = elementFromIndex - damage;
                        warShip.set(index,newElement);
                    }
                }

            } else if (input.contains("Defend")) {
                int startIndex = Integer.parseInt(input.split(" ")[1]);
                int endIndex = Integer.parseInt(input.split(" ")[2]);
                int damage = Integer.parseInt(input.split(" ")[3]);
                if (startIndex >= 0 && startIndex < pirateShip.size() &&
                        (endIndex >= 0 && endIndex < pirateShip.size())) {

                    for (int i = startIndex; i <= endIndex; i++) {
                        int currentIndexNum = pirateShip.get(i);
                        if (currentIndexNum - damage <= 0){
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }else {
                           int newNum = currentIndexNum - damage;
                           pirateShip.set(i,newNum);
                        }
                    }
                }
            } else if (input.contains("Repair")) {
                int repairIndex = Integer.parseInt(input.split(" ")[1]);
                int health = Integer.parseInt(input.split(" ")[2]);
                if (repairIndex >= 0 && repairIndex < pirateShip.size()) {
                    int repairIndexNumber = pirateShip.get(repairIndex);
                    health = Math.min(health + repairIndexNumber,maxHealth);
                    pirateShip.set(repairIndex,health);

                }
            } else if (input.equals("Status")) {
                int count = 0;
                double percent = maxHealth * 0.2;

                for (Integer i : pirateShip) {
                    if (i < percent){
                        count++;
                    }
                }
                System.out.printf("%d sections need repair.",count);
                System.out.println();
            }


            input = scanner.nextLine();

        }
        int sumPirateShip = 0;
        for (Integer i : pirateShip) {
            sumPirateShip += i;
        }
        System.out.printf("Pirate ship status: %d",sumPirateShip);
        System.out.println();

        int sumWarShip = 0;
        for (Integer i : warShip) {
            sumWarShip += i;
        }
        System.out.printf("Warship status: %d",sumWarShip);

    }
}
