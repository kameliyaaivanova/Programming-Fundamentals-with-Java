package MethodsExercises;

import java.util.Scanner;

public class _10_TopNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            boolean isValidDigitsDivisibleBy8 = sumOfDigitsDivisibleBy8(i);
            boolean isValidAtLeastOneOddDigits = atLeastOneOddDigit(i);

            if (isValidAtLeastOneOddDigits && isValidDigitsDivisibleBy8) {
                System.out.println(i);
            }
        }
    }
    public static boolean sumOfDigitsDivisibleBy8(int number){

        int sum = 0;

        while (number > 0){
           int lastDigit = number % 10;
           sum += lastDigit;
           number /= 10;
       }

       if (sum % 8 == 0){
           return true;
       } else {
           return false;
       }
    }

    public static boolean atLeastOneOddDigit(int number){

        while (number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }
}