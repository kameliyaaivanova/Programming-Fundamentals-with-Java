package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            if (input.contains("Add")){
                int number = Integer.parseInt(input.split(" ")[1]);
                wagons.add(number);
            } else {
                int number = Integer.parseInt(input.split(" ")[0]);
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int peopleInWagon = wagons.get(i);
                    if (peopleInWagon + number <= maxCapacity){
                        wagons.set(i,number + peopleInWagon );
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}