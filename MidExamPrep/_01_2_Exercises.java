package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_2_Exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Finish")){
           String command = input.split(" ")[0];

           if (command.contains("Add")){
               int currentValue = Integer.parseInt(input.split(" ")[1]);
               numbers.add(currentValue);

           } else if (command.contains("Remove")) {
               int currentValue = Integer.parseInt(input.split(" ")[1]);
               int currentValueIndex = numbers.indexOf(currentValue);
               if (numbers.contains(currentValue)){
                   numbers.remove(currentValueIndex);
               }

           } else if (command.contains("Replace")) {
               int currentValue = Integer.parseInt(input.split(" ")[1]);
               int replacement = Integer.parseInt(input.split(" ")[2]);
               if (numbers.contains(currentValue)){
                   numbers.set(numbers.indexOf(currentValue), replacement);
               }

           } else if (command.contains("Collapse")) {
               int currentValue = Integer.parseInt(input.split(" ")[1]);
               for (int i = 0; i < numbers.size(); i++) {
                   int currentNumber = numbers.get(i);
                   if (currentNumber < currentValue){
                       numbers.remove((Integer) currentNumber);
                   }
               }

           }


            input = scanner.nextLine();

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
