package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentElement = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextElement = numbers[j];
                if (currentElement + nextElement == number){
                    System.out.println(currentElement + " " + nextElement);
                }
            }
        }
    }
}
