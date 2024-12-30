package BasicsExercises;

import java.util.Scanner;

public class _08_TriangleOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n ; row++) {
            for (int number = 1; number <= row ; number++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
