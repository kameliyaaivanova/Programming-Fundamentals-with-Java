package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // trqbva da printiram na koi index se namira chisloto , koeto e ravno na
        // sumata na elementite ot lqvo i sumata na elementite ot dqsno
        // ako nqma takova chislo printirame "no"

        //1. chetem si vhodnite danni - masiv ot integers
        //2. pravim for loop za da moje da minem prez elementite kato zapochen ot 0
        //3. pravim vtori for loop, koito shte zapochne ot 0 do indexa za da moje da obhojdame elementite ot lqvo do nashiq index ot purviq loop
        //4. suzdavame nova promenliva sumLeftElements za da pribavqme sumata na elementite ot lqvo
        //4. prabim treti for loop, koito shte zapochne ot indexa + 1 i shte e po maluk ili raven na krainiq index t.e numbers.lenght - 1 ,
        // za da moje da obhojdame elementite ot dqsno na nashiq index ot purviq loop
        //5.suzdavame nova promenlira sumRightElements za da pribavqme sumata na elementite ot dqsno
        //6. ako sumata na elementite ot lqvo, e ravna na sumata na elementite ot dqsno printitrame
        //iindexa na koito se namira elementa.
        //.7 ako nqma edvakvi sumi printirame "no"


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int index = 0; index <= numbers.length-1 ; index++) {

            int sumLeftIndex = 0;
            int sumRightIndex = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {

                sumLeftIndex += numbers[leftIndex];

            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length-1 ; rightIndex++) {

                sumRightIndex += numbers[rightIndex];
            }

            if (sumLeftIndex == sumRightIndex){
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");
    }
}
