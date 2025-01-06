package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _07_WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int waterTankCapacity = 255;
        int newCapacity = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int quantitiesOfWater = Integer.parseInt(scanner.nextLine());
            newCapacity += quantitiesOfWater;

            if (newCapacity > waterTankCapacity){
                newCapacity -= quantitiesOfWater;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(newCapacity);
    }
}
