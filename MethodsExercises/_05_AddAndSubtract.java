package MethodsExercises;

import java.util.Scanner;

public class _05_AddAndSubtract {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtracting(number1,number2,number3));

    }
    public static int adding (int number1,int number2){
        return number1 + number2;
    }

    public static int subtracting(int number1,int number2,int number3){
       return adding(number1,number2) - number3;
    }

}
