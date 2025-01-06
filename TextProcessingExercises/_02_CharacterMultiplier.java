package TextProcessingExercises;

import java.util.Scanner;

public class _02_CharacterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        String firstWord = words[0];
        String secondWord = words[1];

        sumOfWords(firstWord, secondWord);
    }

    public static void sumOfWords(String firstWord, String secondWord) {

        int minLength = Math.min(firstWord.length(), secondWord.length());
        int maxLength = Math.max(firstWord.length(), secondWord.length());

        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += firstWord.charAt(i) * secondWord.charAt(i);
        }
        if (firstWord.length() == secondWord.length()) {
            System.out.println(sum);
        } else if (firstWord.length() == maxLength) {
            for (int i = minLength; i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }
            System.out.println(sum);
        } else if (secondWord.length() == maxLength) {
            for (int i = minLength; i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
            System.out.println(sum);
        }
    }
}