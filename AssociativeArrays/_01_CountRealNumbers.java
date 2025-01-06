package AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Double, Integer> numbers = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double num : nums) {
            if (numbers.containsKey(num)) {
                numbers.put(num, numbers.get(num) + 1);
            } else {
                numbers.put(num, 1);

            }
        }

        for (Map.Entry<Double, Integer> kvp : numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", kvp.getKey(), kvp.getValue());
        }

    }
}
