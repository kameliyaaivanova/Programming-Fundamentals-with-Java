package TextProcessingExercises;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder(text);

        for (int i = 0; i < newText.length() - 1; i++) {
            if (newText.charAt(i) == newText.charAt(i + 1)){
                newText.deleteCharAt(i+1);
                i--;
            }

        }
        System.out.println(newText);


    }
}
