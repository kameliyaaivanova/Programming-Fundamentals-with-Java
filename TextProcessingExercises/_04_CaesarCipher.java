package TextProcessingExercises;

import java.util.Scanner;

public class _04_CaesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char newSymbol = (char) (symbol + 3);
            newText.append(newSymbol);
        }

        System.out.println(newText);

//        for (int i = 0; i < text.length(); i++) {
//            char currentSymbol = (char) (text.charAt(i) + 3);
//            newText.append(currentSymbol);
//        }
//        System.out.println(newText);




    }
}
