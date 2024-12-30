package ArraysExercises;

import java.util.Scanner;

public class exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String[] numbers = scanner.nextLine().split(" ");

       int n = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= n ; rotation++) {

            String firstNumber = numbers[0];

            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i+1];

            }
            numbers[numbers.length-1] = firstNumber;

        }

        for (String number : numbers) {
            System.out.print(number + " ");
        }


    }
}
