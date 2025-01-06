package Lists;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandAsArray = command.split(" ");
            switch (commandAsArray[0]) {
                case "Add":
                    int numberAdd = Integer.parseInt(command.split(" ")[1]);
                    numbers.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(command.split(" ")[1]);
                    numbers.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    int number = Integer.parseInt(command.split(" ")[1]);
                    int indexInsert = Integer.parseInt(command.split(" ")[2]);
                    numbers.add(indexInsert, number);
                    break;
            }
            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}