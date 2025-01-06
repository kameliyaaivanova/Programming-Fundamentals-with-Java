package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _05_PrintPartOfTheASCIITable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int currentElement = start; currentElement <= end; currentElement++) {
            char currentElementInChar = (char) currentElement;
            System.out.print(currentElementInChar + " ");
        }
    }
}
