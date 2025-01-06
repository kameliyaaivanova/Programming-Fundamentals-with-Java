package MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class _14_TheLift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waitingPeopleForLift = Integer.parseInt(scanner.nextLine());
        int maxCapacity = 4;

        int[] wagons = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isLiftFull = true;

        for (int position = 0; position < wagons.length; position++) {

            int availableSpace = maxCapacity - wagons[position];

            if (availableSpace > 0) {
                if (availableSpace > waitingPeopleForLift) {
                    wagons[position] += waitingPeopleForLift;
                    waitingPeopleForLift = 0;
                    isLiftFull = false;
                } else {
                    wagons[position] = maxCapacity;
                    waitingPeopleForLift -= availableSpace;
                }
            }
        }

        if (!isLiftFull) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeopleForLift > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeopleForLift);
        }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}