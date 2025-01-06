package MethodsExercises;

import java.util.Scanner;

public class _07_NxNMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        square(n);
    }
    public static void square(int n){
        for (int row = 0; row < n ; row++) {
            for (int length = 0; length < n ; length++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}