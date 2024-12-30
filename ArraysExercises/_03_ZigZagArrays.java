package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _03_ZigZagArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] sequence1 = new String[n];
        String[] sequence2 = new String[n];

        for (int i = 1; i <= n ; i++) {

            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");

           String firstElement = inputArray[0];
           String secondElement = inputArray[1];

            if (i % 2 == 0){
                sequence1 [i - 1] = secondElement;
                sequence2 [i - 1] = firstElement;
            } else {
                sequence1 [i - 1] = firstElement;
                sequence2 [i - 1] = secondElement;
            }


        }

        for (String sequence : sequence1) {
            System.out.print(" " + sequence);
        }
        System.out.println();

        for (String sequence : sequence2) {
            System.out.print(" " + sequence);
        }





    }

 }
