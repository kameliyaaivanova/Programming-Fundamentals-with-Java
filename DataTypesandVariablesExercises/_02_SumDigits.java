package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _02_SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0){
            int currentNum = number % 10;
            number /= 10;
            sum += currentNum;
        }
        System.out.println(sum);
    }
}
