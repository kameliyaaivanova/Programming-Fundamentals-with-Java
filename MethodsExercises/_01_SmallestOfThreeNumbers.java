package MethodsExercises;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        System.out.println(theSmallestNum(number1,number2,number3));
    }
    public static int theSmallestNum (int number1,int number2,int number3){
        if (number1 < number2 && number1 < number3){
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
