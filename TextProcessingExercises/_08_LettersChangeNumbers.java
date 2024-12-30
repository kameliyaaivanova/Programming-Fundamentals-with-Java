package TextProcessingExercises;

import java.util.Scanner;

public class _08_LettersChangeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split("\\s+");

            double sum = 0;

            for (String string : input) {

            double modifiedNumber = getModifiedNumber(string);
            sum += modifiedNumber;

        }
        System.out.printf("%.2f%n",sum);

    }

    private static double getModifiedNumber(String string) {

        char elementBefore = string.charAt(0);
        char elementAfter = string.charAt(string.length()-1);
        double number = Double.parseDouble((string.replace(elementBefore,' ')
                                                  .replace(elementAfter,' ')
                                                  .trim()));

        if (Character.isUpperCase(elementBefore)){
            int positionLetter = (int) elementBefore - 64;
            number /= positionLetter;

        } else {
            int positionLetter = (int)elementBefore - 96;
            number *= positionLetter;
        }

        if (Character.isUpperCase(elementAfter)){
            int positionLetter = (int) elementAfter - 64;
            number -= positionLetter;

        } else {
            int positionLetter = (int)elementAfter - 96;
            number += positionLetter;
        }

        return number;


    }
}
