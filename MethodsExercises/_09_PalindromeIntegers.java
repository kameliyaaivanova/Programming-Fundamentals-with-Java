package MethodsExercises;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class _09_PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            System.out.println(isPalindrom(input));
            input = scanner.nextLine();
        }
    }
    public static boolean isPalindrom (String number ){
        String reversed = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversed += number.charAt(i);

        }
        if (reversed.equals(number)){
            return true;
        } else {
            return false;
        }

    }
}
