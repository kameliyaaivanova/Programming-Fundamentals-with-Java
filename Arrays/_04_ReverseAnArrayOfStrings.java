package Arrays;

import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length / 2; i++) {
            String oldPosition = input[i];
            input [i] = input[input.length - 1 - i];
            input[input.length - 1 - i] = oldPosition;
        }

        System.out.println(String.join(" ",input));
    }
}
