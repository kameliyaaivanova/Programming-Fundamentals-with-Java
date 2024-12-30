package Lists;

import java.util.*;
import java.util.stream.Collectors;

public class _07_RemoveNegativesAndReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n < 0);
        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");

        } else {
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }
}
