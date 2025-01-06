package MidExamPrep;

import java.util.Scanner;

public class _07_CounterStrike {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int win = 0;

        while (initialEnergy >= 0 && !command.equals("End of battle")) {
            int distanceOfEnemy = Integer.parseInt(command);

            if (initialEnergy >= distanceOfEnemy) {
                initialEnergy -= distanceOfEnemy;
                win++;
                if (win % 3 == 0) {
                    initialEnergy += win;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", win, initialEnergy);
                return;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", win, initialEnergy);
    }
}