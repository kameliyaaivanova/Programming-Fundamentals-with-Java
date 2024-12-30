package ListsExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ChangeList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.contains("Delete")){
                int element = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Collections.singleton(element));

            }else if (command.contains("Insert")){
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position,element);

            }


            command = scanner.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
