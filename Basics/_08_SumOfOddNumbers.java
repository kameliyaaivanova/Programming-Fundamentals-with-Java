package Basics;

import java.util.Scanner;

public class _08_SumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddNum = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += oddNum;
            System.out.println(oddNum);
            oddNum += 2;
        }

        System.out.printf("Sum: %d", sum);
    }
}
