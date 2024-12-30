package BasicsExercises;

import java.util.Scanner;

public class _06_StrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i <= number.length() - 1 ; i++) {

           int digit = Integer.parseInt(number.charAt(i) + "");

           int factorial = 1;

            for (int j = 2; j <= digit ; j++) {

                factorial *= j;
            }

            sum += factorial;

        }
        int numberAsInt = Integer.parseInt(number);
        if (sum == numberAsInt){
            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }
}
