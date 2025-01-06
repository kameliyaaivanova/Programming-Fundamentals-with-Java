package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            if (command.contains("Add")){
                int number = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(number);
            } else if (command.contains("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, number);
                }else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (command.contains("Shift left")){
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstNum);
                }
            } else if (command.contains("Shift right")) {
                int count = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < count; i++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0,lastNum);
                }
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}