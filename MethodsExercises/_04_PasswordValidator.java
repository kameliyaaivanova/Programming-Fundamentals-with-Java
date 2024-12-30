package MethodsExercises;

import java.util.Scanner;

public class _04_PasswordValidator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidCharacters = characters(password);
        if (!isValidCharacters) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValidLetterAndDigits = lettersAndDigits(password);
            if (!isValidLetterAndDigits){
                System.out.println("Password must consist only of letters and digits");
            }

        boolean isValidAtLeast2Digits = atLeast2Digits(password);
            if (!isValidAtLeast2Digits){
                System.out.println("Password must have at least 2 digits");
            }

            if (isValidCharacters && isValidLetterAndDigits && isValidAtLeast2Digits){
                System.out.println("Password is valid");
            }
        System.out.println();



    }

    public static boolean characters(String password){
       int passwordLength = password.length();

       if (passwordLength >= 6 && passwordLength <= 10){
           return true;
       } else {
           return false;
       }
    }

    public static boolean lettersAndDigits(String password){
        for (char currentElement : password.toCharArray()) {
            if (!Character.isLetterOrDigit(currentElement)){
                return false;
            }
        }
        return true;

    }
    public static boolean atLeast2Digits(String password){
        int digitsCount = 0;
        for (char currentElement:password.toCharArray()) {
            if (Character.isDigit(currentElement)){
                digitsCount ++;
            }
        }
        if (digitsCount >= 2){
            return true;
        }else {
           return false;
        }

    }

}
