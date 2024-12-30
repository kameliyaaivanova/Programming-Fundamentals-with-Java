package MethodsExercises;

import java.util.Scanner;

public class _08_FactorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = factorialFirstNumber(number1);
        long factSecondNumber = factorialSecondNumber(number2);

        double result = (double) factFirstNumber / factSecondNumber;

        System.out.printf("%.2f",result);


    }
    public static long factorialFirstNumber(int number1){
        long fact = 1;
        for (int i = 2; i <= number1 ; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static long factorialSecondNumber(int number2){
        long fact = 1;
        for (int i = 2; i <= number2 ; i++) {
            fact = fact * i;
        }
        return fact;

    }
}
