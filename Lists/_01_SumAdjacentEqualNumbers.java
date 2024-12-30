package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);
            double newNum = currentNum + nextNum;

            if (currentNum == nextNum){
                numbers.set(i,newNum);
                numbers.remove(i + 1);
                i = -1;
            }

        }

        for (double num : numbers) {
            System.out.print(new DecimalFormat("0.###").format(num)+ " ");
        }

        System.out.println();

    }
}
