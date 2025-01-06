package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> result = new LinkedHashMap<>();

        String word = scanner.nextLine();

        for (char character : word.toCharArray()) {
            if (character == ' ') {
                continue;
            }

            if (!result.containsKey(character)) {
                result.put(character, 1);
            } else {
                int count = result.get(character);
                result.put(character, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> kvp : result.entrySet()) {
            System.out.printf("%s -> %d%n", kvp.getKey(), kvp.getValue());
        }
    }
}
