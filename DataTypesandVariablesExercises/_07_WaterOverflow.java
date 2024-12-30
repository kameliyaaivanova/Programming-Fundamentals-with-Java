package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _07_WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. prochitame vhodnite danni

        // - daden ni e voden tank s kapacitet ot 255 litra.
        // - dadeni sa ni litrite voda, koito trqbva da se poberat v nego
        // - ako kapaciteta ne e dostatuchen za tezi litri printirame
        // Insufficient capacity!" i produljavame da chetem sledvashtiq red
        // - sled kato prochetem vsichki litri, printirame  litrite,
        // koito se pobirat v nashiq tank.

        // 2. zapochvame da pishem kod
        // - suzdavame for - loop kolkoto sa dadenite redove - done
        // - v for loopa prochitame litrite voda koito trqbva da dobavim - done
        // - tezi litri voda gi izvajdame ot kapaciteta na vodniq tank.
        // - ako kapaciteta - tezi litri voda stane po malko ot 0 to togava
        // printirame Insufficient capacity i gi premahvame.
        // - sled koeto prochitame sledvashtite litri.
        // na kraq printirame litrite koito pobirame vuv vodniq tank.

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int waterTankCapacity = 255;
        int newCapacity = 0;

        for (int i = 1; i <= numberOfLines ; i++) {

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
