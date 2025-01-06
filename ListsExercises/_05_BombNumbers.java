package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> num = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] tokens = scanner.nextLine().split(" ");
        int number = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (num.contains(number)) {
            int bombIndex = num.indexOf(number);
            int leftBound = Math.max(bombIndex - power,0);
            int rightBound = Math.min(bombIndex + power,num.size() - 1);

            for (int i = rightBound; i >= leftBound ; i--) {
                num.remove(i);
            }
        }
        int sum = 0;

        for (Integer integer : num) {
            sum += integer;
        }
        System.out.println(sum);
    }
}