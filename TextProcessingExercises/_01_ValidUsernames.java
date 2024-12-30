package TextProcessingExercises;

import java.util.Scanner;

public class _01_ValidUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");

        for (String word : words) {
            boolean validWord = getValidWord(word);
            if (validWord){
                System.out.println(word);
            }
        }

    }

    private static boolean getValidWord(String word) {

        if (word.length() < 3 || word.length() > 16){
            return false;
        }

        for (char symbol : word.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_' ){
                return false;
            }
        }

        return true;
    }
}
