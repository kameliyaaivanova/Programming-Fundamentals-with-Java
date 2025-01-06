package TextProcessing;

import java.util.Arrays;
import java.util.Scanner;

public class _04_TextFilter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            String replacedWord = getReplacedWord(word);
            text = text.replace(word, replacedWord);
        }
        System.out.println(text);
    }

    private static String getReplacedWord(String word) {
        char[] replacementCharArray = new char[word.length()];
        Arrays.fill(replacementCharArray, '*');
        return new String(replacementCharArray);
    }
}
