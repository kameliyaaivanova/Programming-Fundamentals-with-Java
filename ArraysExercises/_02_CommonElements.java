package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _02_CommonElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArray = (scanner.nextLine().split(" "));
        String[] secondArray = (scanner.nextLine().split(" "));

        for (String elementsFromSecondArray : secondArray) {
            for (String elementsFromFirstArray : firstArray) {
                if (elementsFromSecondArray.equals(elementsFromFirstArray)){
                    System.out.print(elementsFromSecondArray + " ");
                }
            }
        }
    }
}
