package DataTypesandVariablesExercises;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class _11_Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double snowballValue;
        double highestSnowballValue = Double.MIN_VALUE;
        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;

        for (int i = 1; i <= numberOfSnowballs ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            snowballValue = Math.pow(snowballSnow /snowballTime,snowballQuality);

            if (snowballValue > highestSnowballValue){
                highestSnowballValue = snowballValue;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowMax,snowballTimeMax,highestSnowballValue,snowballQualityMax);
    }
}
