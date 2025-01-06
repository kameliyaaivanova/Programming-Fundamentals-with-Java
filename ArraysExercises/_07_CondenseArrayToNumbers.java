package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int positions = numbers.length - 1;

        while (positions > 0) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int sum = numbers[i] + numbers[i + 1];
                numbers[i] = sum;
            }
            positions--;
        }
        System.out.println(numbers[0]);
    }
}
