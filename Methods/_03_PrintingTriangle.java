package Methods;

import java.util.Scanner;

public class _03_PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            printRow(i);
        }

        for (int i = number - 1; i >= 1; i--) {
            printRow(i);
        }

    }
    public static void printRow(int number){

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}