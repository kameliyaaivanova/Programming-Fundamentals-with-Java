package MethodsExercises;

import java.util.Scanner;

public class _02_VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelsCount(input);
    }
    public static void vowelsCount (String input){
        int sum = 0;
        for (int i = 0; i < input.length() ; i++) {
            char currentElement = input.charAt(i);

            if (currentElement == 'a' || currentElement == 'u' || currentElement == 'o' || currentElement == 'e' || currentElement == 'i' ||
                    currentElement == 'A' || currentElement == 'U' || currentElement == 'O' || currentElement == 'E' || currentElement == 'I' ){
                sum++;
            }

        }
        System.out.println(sum);
    }

}
