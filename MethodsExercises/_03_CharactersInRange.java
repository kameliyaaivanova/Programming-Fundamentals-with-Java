package MethodsExercises;

import java.util.Scanner;

public class _03_CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char start = (scanner.nextLine()).charAt(0);
        char end = (scanner.nextLine()).charAt(0);
        charactersBetween(start,end);
    }

    public static void charactersBetween(char start,char end){

        if (start < end) {

            for (char i = (char) (start + 1); i < end; i++) {
                System.out.print(i + " ");

            }
        } else {

            for (char i = (char) (end + 1); i < start; i++) {
                System.out.print(i + " ");

            }

        }

    }
}
