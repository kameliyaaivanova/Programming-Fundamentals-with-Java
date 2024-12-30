package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Write a program to find all the top integers in an array.
        // A top integer is an integer that is bigger than all the elements to its right.

        // prochitame masiv ot int - done
        // minavame prez chisla s for loop -done
        // inicializirame tekushtiq element - done
        // suzdavame vtori for loop za da minem prez ostanalite elementi,koito zapochva ot i+1 - done
        // suzadavame vtora promenliva - done
        // proverqvame koq promenliva e po golqma
        //ako purvata promenliva e po golqma ot vsichki pishem neq
        //ako purvata promenliva e po malka ot edno ot ostanalite chisla ne q pishem- break

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();




        for (int i = 0; i < numbers.length; i++) {

            int currentElement = numbers[i];

            if (i == numbers.length - 1){
                System.out.print(currentElement + " ");
                break;
            }

            boolean isTop = false ;

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int nextElement = numbers[j];

                if (currentElement > nextElement){
                   isTop = true;

                } else {
                    isTop = false;
                    break;
                }
            }

            if (isTop){
                System.out.print(currentElement + " ");


            }        }


    }
}

