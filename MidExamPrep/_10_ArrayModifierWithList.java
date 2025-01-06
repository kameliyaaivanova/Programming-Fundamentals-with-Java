package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_ArrayModifierWithList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            switch (command) {
                case "swap":
                    int index1 = Integer.parseInt(input.split(" ")[1]);
                    int index2 = Integer.parseInt(input.split(" ")[2]);
                    int numberAtFirstIndex = numbers.get(index1);
                    int numberAtSecondIndex = numbers.get(index2);
                    numbers.set(index1, numberAtSecondIndex);
                    numbers.set(index2, numberAtFirstIndex);
                    break;
                case "multiply":
                    int index1Multiply = Integer.parseInt(input.split(" ")[1]);
                    int index2Multiply = Integer.parseInt(input.split(" ")[2]);
                    int firstNumber = numbers.get(index1Multiply);
                    int secondNumber = numbers.get(index2Multiply);
                    int product = firstNumber * secondNumber;
                    numbers.set(index1Multiply, product);
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        int currentNumber = numbers.get(i);
                        numbers.set(i, currentNumber - 1);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replace("[", "")
                .replace("]", ""));
    }
}