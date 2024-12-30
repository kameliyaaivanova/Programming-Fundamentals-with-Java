package TextProcessing;

import java.util.Scanner;

public class _00_Exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     String input = scanner.nextLine();

     while (!input.equals("end")){

         StringBuilder reversedWord = new StringBuilder(input).reverse();

         System.out.println(reversedWord);

         input = scanner.nextLine();

     }

    }
}
