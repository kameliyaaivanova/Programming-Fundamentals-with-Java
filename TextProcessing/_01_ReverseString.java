package TextProcessing;

import java.util.Scanner;

public class _01_ReverseString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        while (!word.equals("end")) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            System.out.printf("%s = %s%n", word, reversedWord);
            word = scanner.nextLine();
        }
    }
}
