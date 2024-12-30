package MethodsExercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class _06_MiddleCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        middleCharacter(text);

    }
    public static void middleCharacter(String text) {
       int textLength = text.length();

       if (textLength % 2 != 0){
           int middleCharacter = textLength / 2;
           System.out.println(text.charAt(middleCharacter));

       } else {
           int firstMiddleCharacter = text.length()/2 - 1;
           int secondMiddleCharacter = text.length() / 2;
           System.out.print(text.charAt(firstMiddleCharacter));
           System.out.print(text.charAt(secondMiddleCharacter));
       }
    }
}
