package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _03_SumEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int totalSum = 0;

        for (int i = 0; i < numbers.length ; i++) {

            int currentNumber = numbers[i];

            if (currentNumber % 2 == 0){
                totalSum += currentNumber;
            }
        }

        System.out.println(totalSum);
    }
}
