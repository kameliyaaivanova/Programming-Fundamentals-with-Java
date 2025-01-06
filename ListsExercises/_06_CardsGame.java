package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_CardsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

       while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()){
           int firstPlayerCard = firstPlayer.get(0);
           int secondPlayerCard = secondPlayer.get(0);
           firstPlayer.remove(0);
           secondPlayer.remove(0);
           if (firstPlayerCard > secondPlayerCard){
               firstPlayer.add(firstPlayerCard);
               firstPlayer.add(secondPlayerCard);
           } else if (firstPlayerCard < secondPlayerCard) {
               secondPlayer.add(secondPlayerCard);
               secondPlayer.add(firstPlayerCard);
           }
       }

       if (!firstPlayer.isEmpty()) {
           int sumFirstPlayer = firstPlayer.stream().mapToInt(Integer::intValue).sum();
           System.out.println("First player wins! Sum: " + sumFirstPlayer);
       } else {
           int sumSecondPlayer = secondPlayer.stream().mapToInt(Integer::intValue).sum();
           System.out.println("Second player wins! Sum: " + sumSecondPlayer);
       }
    }
}