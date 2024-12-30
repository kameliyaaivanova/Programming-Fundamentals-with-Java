package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_ListManipulationAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.contains("Contains")){
                int number = Integer.parseInt(command.split(" ")[1]);
                if (numbers.contains(number)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.equals("Print even")) {
                for (int number:numbers) {
                    if (number % 2 == 0 ){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();

            } else if (command.equals("Print odd")) {
                for (int number :numbers) {
                    if (number % 2 != 0){
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            } else if (command.equals("Get sum")) {
                int sum = 0;
                for (int number:numbers) {
                    sum += number;
                }
                System.out.printf("%d%n",sum);

            } else if (command.contains("Filter")) {
                String condition = command.split(" ")[1];
                int number = Integer.parseInt(command.split(" ")[2]);
                if (condition.equals("<")){
                    for (int num:numbers) {
                        if (num < number){
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals(">")) {
                    for (int num:numbers) {
                        if (num > number) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();

                } else if (condition.equals(">=")) {
                    for (int num:numbers) {
                        if (num >= number) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();

                } else if (condition.equals("<=")) {
                    for (int num:numbers) {
                        if (num <= number) {
                            System.out.print(num + " ");
                        }
                    }
                    System.out.println();
                }
            }


            command = scanner.nextLine();

        }

    }
}
