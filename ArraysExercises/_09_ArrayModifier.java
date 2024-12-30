package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _09_ArrayModifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // daden ni e masiv ot intigers
        // na sledvashtiq red sa ni dadeni komandi
        // dokato ne poluchim komandata end nie trqbva da izvushvame funkciite,
        // koito komandite ni zadavat
        // funkciq 1- trqbva da smenim mestata na dadenite indexi
        // funkciq 2 - trqbva da umnojim dadenite indexi
        // funkciq 3 - da namalim vsichki element s 1 t.e -1;

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end") ){

            if (command.contains("swap")) {
                int swapFirstIndex = Integer.parseInt(command.split(" ")[1]);
                int swapSecondIndex = Integer.parseInt( command.split(" ")[2]);

                int firstNum = numbers[swapFirstIndex];
                int secondNum = numbers[swapSecondIndex];

                numbers[swapFirstIndex] = secondNum;
                numbers[swapSecondIndex] = firstNum;



            } else if (command.contains("multiply")) {
                int multiplyFirstIndex = Integer.parseInt(command.split(" ")[1]);
                int multiplySecondIndex = Integer.parseInt(command.split(" ")[2]);

                int firstNum = numbers[multiplyFirstIndex];
                int secondNum = numbers[multiplySecondIndex];

                int product = firstNum * secondNum;

                numbers[multiplyFirstIndex] = product;

            } else if (command.equals("decrease")) {

                for (int i = 0; i <= numbers.length - 1 ; i++) {
                    numbers[i]--;
                }

            }


            command = scanner.nextLine();

        }

        System.out.println(Arrays.toString(numbers)
                .replace("[","").replace("]",""));

    }
}
