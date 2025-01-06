package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int numberSize = numbers.size();

        for (int i = 0; i < numberSize / 2; i++) {
           int currentNum = numbers.get(i);
           int lastNum = numbers.get(numbers.size() - 1);
           numbers.set(i, currentNum + lastNum);
           numbers.remove(numbers.size() - 1);
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
