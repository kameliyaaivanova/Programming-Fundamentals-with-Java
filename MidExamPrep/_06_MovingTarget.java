package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_MovingTarget {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){

            if (command.contains("Shoot")){
                int index = Integer.parseInt(command.split(" ")[1]);
                int power = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= targets.size()-1){
                    targets.set(index, targets.get(index) - power);
                    if (targets.get(index) <= 0){
                        targets.remove(index);
                    }
                }

            } else if (command.contains("Add")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int value = Integer.parseInt(command.split(" ")[2]);

                if (index >= 0 && index <= targets.size()-1) {
                    targets.add(index,value);
                }else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.contains("Strike")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int radius = Integer.parseInt(command.split(" ")[2]);
                int leftIndex = index - radius;
                int rightIndex = index + radius;

                if ((leftIndex >= 0 && leftIndex <= targets.size()-1) && (rightIndex >= 0 && rightIndex <= targets.size()-1) ) {
                   int count = radius * 2 + 1;
                    for (int i = 0; i < count; i++) {
                        targets.remove(leftIndex);
                    }

                } else {
                    System.out.println("Strike missed!");

                }
            }

            command = scanner.nextLine();

        }
        System.out.println(targets.toString()
                .replace("[", "")
                .replace("]", "")
                .replaceAll(",", "|")
                .replaceAll(" ",""));

    }
}
