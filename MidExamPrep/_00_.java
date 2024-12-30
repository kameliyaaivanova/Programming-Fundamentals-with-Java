package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _00_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")){
            String[] command = input.split(" ");
            String commandName = command[0];
            int value = Integer.parseInt(command[1]);

            switch (commandName){
                case "Add":
                    numbers.add(value);
                    break;

                case "Remove":
                    if (numbers.contains(value)){
                        numbers.remove((Integer) value);
                    }
                    break;

                case "Replace":
                    int replacement = Integer.parseInt(command[2]);
                    if (numbers.contains(value)){
                        int valueIndex = numbers.indexOf(value);
                        numbers.set(valueIndex,replacement);
                    }
                    break;

                case "Collapse":
                    numbers.removeIf(i -> i < value);
                    break;
            }



            input = scanner.nextLine();

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
