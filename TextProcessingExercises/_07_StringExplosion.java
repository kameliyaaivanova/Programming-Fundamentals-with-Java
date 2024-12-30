package TextProcessingExercises;

import java.util.Scanner;

public class _07_StringExplosion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder newText = new StringBuilder(input);

        int totalStrength = 0;
        for (int i = 0; i <= newText.length() - 1; i++) {
            char currentSymbol = newText.charAt(i);
            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(newText.charAt(i + 1) + "");
                totalStrength += explosionStrength;
            } else if (currentSymbol != '>' && totalStrength > 0){

                newText.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }

        System.out.println(newText);

//        String text = scanner.nextLine();
//        StringBuilder newText = new StringBuilder(text);
//
//
//        int totalStrength = 0;
//        for (int i = 0; i < newText.length() - 1; i++) {
//            char currentSymbol = newText.charAt(i);
//            if (currentSymbol == '>'){
//                int explosionStrength = Integer.parseInt(newText.charAt(i + 1) + ""); //сила на експлозия
//                totalStrength += explosionStrength;
//            } else if (currentSymbol != '>' && totalStrength > 0){
//                newText.deleteCharAt(i);
//                totalStrength--;
//                i--;
//            }
//        }
//        System.out.println(newText);


    }
}
