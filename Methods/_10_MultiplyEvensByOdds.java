package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _10_MultiplyEvensByOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.println(getMultiple(number));

    }
    public static int getMultiple (int number){
        int sumOfOdd = oddNumbers(number);
        int sumOfEven = evenNumbers(number);
        return sumOfEven * sumOfOdd;
    }
    public static int evenNumbers (int number) {

        String intToString = Integer.toString(number);

        int[] array = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEven+= array[i];
            }
        }
        return sumEven;
    }

    public static int oddNumbers(int number) {
        String intToString = Integer.toString(number);

        int[] array = Arrays.stream(intToString.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sumOdd = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOdd += array[i];
            }
        }
        return sumOdd;
    }
}