package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class _08_MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        int numberOfMoves = 0;

        while (!input.equals("end")){
            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            numberOfMoves++;

            boolean isValid = isValid(firstIndex,secondIndex,elements.size()-1);
            if (!isValid){
                String adding = "-" + numberOfMoves + "a";
                elements.add(elements.size()/2,adding);
                elements.add(elements.size()/2,adding);
                System.out.println("Invalid input! Adding additional elements to the board");

            } else {
                String firstNumber = elements.get(firstIndex);
                String secondNumber = elements.get(secondIndex);

                if (firstNumber.equals(secondNumber)){
                    elements.remove(firstNumber);
                    elements.remove(secondNumber);
                    System.out.printf("Congrats! You have found matching elements - %s!%n",firstNumber);
                } else {
                    System.out.println("Try again!");
                }

            }
            if (elements.isEmpty()){
                System.out.printf("You have won in %d turns!%n",numberOfMoves);
                return;
            }


            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        for (String element:elements) {
            System.out.print(element + " ");
        }


    }

    private static boolean isValid(int firstIndex, int secondIndex, int lastIndex) {

        boolean areNotTheSameIndexes = firstIndex != secondIndex;
        boolean firstIndexOutOfBound = firstIndex >= 0 && firstIndex<= lastIndex;
        boolean secondIndexOutOfBound = secondIndex >= 0 && secondIndex <= lastIndex;

        return areNotTheSameIndexes && firstIndexOutOfBound && secondIndexOutOfBound;
    }


}
