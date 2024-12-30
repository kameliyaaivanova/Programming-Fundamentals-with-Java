package TextProcessing;

import java.util.Scanner;

public class _05_DigitsLetterAndOthers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentElement = input.charAt(i);

            if (Character.isDigit(currentElement)){
                digits.append(currentElement);
            } else if (Character.isAlphabetic(currentElement)) {
                letters.append(currentElement);
            }else {
                others.append(currentElement);
            }
        }

        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(others.toString());
    }
}
