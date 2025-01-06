package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_MuOnline {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int initialHealth = 100;
        int initialBitcoins = 0;

        for (int i = 0; i < rooms.size(); i++) {

            String room = rooms.get(i);
            String roomCommand = room.split(" ")[0];

            if (roomCommand.equals("potion")) {
                int roomNum = Integer.parseInt(room.split(" ")[1]);
                int healthBeforeHealing = initialHealth;
                initialHealth = Math.min(initialHealth + roomNum, 100);

                System.out.printf("You healed for %d hp.%n", initialHealth - healthBeforeHealing);
                System.out.printf("Current health: %d hp.%n", initialHealth);

            } else if (roomCommand.equals("chest")) {
                int bitcoins = Integer.parseInt(room.split(" ")[1]);
                initialBitcoins += bitcoins;
                System.out.printf("You found %d bitcoins.%n", bitcoins);

            } else {
                int attack = Integer.parseInt(room.split(" ")[1]);
                String monsterName = room.split(" ")[0];
                initialHealth -= attack;

                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", monsterName);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monsterName);
                    System.out.printf("Best room: %d%n",i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n",initialBitcoins);
        System.out.printf("Health: %d%n",initialHealth);
    }
}