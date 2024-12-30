package MethodsExercises;

import java.util.Scanner;

public class _02_1VowelsCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();
        vowelsCount(text);

    }
    public static void vowelsCount(String text){

        int sum = 0;

        for ( char element : text.toCharArray()) {
            if (element == 'a' || element == 'u' || element == 'o' || element == 'e' || element == 'i' ){
                sum ++;
            }
        }
        System.out.println(sum);


    }
}
