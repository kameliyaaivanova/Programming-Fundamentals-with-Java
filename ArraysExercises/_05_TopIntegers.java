package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];

            if (i == numbers.length - 1){
                System.out.print(currentElement + " ");
                break;
            }
            boolean isTop = false ;

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextElement = numbers[j];
                if (currentElement > nextElement){
                   isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentElement + " ");
            }
        }
    }
}

