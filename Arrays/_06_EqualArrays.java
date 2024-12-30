package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int identicalElements = 0;
        int identicalElementsSum = 0;

        for (int i = 0; i < firstArray.length; i++) {
            int elementFromFirstArray = firstArray[i];
            for (int j = 0; j < secondArray.length; j++) {
                int elementFromSecondArray = secondArray[i];
                if (elementFromFirstArray == elementFromSecondArray){
                    identicalElements++;
                    identicalElementsSum += elementFromFirstArray + elementFromSecondArray;
                }
            }

            if (identicalElements == firstArray.length){
                System.out.printf("Arrays are identical. Sum: %d",identicalElementsSum);
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
            }
        }
    }
}
