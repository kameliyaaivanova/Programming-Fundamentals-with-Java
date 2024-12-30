package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _10_PokeMon {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int originPokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int reachedTarget = 0;
        int pokePowerN = originPokePowerN;

        while (pokePowerN >= distanceM){
            pokePowerN -= distanceM;
            reachedTarget++;

            if (pokePowerN == originPokePowerN / 2){

                if (exhaustionFactorY != 0){
                pokePowerN /= exhaustionFactorY;
                }
            }

        }

            System.out.println(pokePowerN);
            System.out.println(reachedTarget);


    }
}
