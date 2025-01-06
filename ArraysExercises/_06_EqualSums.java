package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int sumLeftIndex = 0;
            int sumRightIndex = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                sumLeftIndex += numbers[leftIndex];
            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                sumRightIndex += numbers[rightIndex];
            }

            if (sumLeftIndex == sumRightIndex){
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
