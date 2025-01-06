package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _04_SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            String letters = scanner.nextLine();
            int lettersInInt = letters.charAt(0);
            sum += lettersInInt;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
