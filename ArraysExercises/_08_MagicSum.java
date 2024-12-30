package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _08_MagicSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // daden ni e masiv ot chisla i oshte edno chislo
        // nie trqbva da proverim koi chisla kato gi suberem ot masiva davat sumata na vtoroto dadeno chislo

        //.1 prochitame si vhodnite danni
        //.2 pravim foor loop za da minem prez elementite
        //.3 vzimame purviq element
        //.4 pravim vtori for loop za da moje da minem prez ostanalite elementi
        //.5 vimame nextElement
        //.6 proverqvame dali purviq element + vtoriq element ne e raven na dadenata suma


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1 ; i++) {
            int currentElement = numbers[i];

            for (int j = i + 1; j <= numbers.length - 1 ; j++) {
                int nextElement = numbers[j];

                if (currentElement + nextElement == number){
                    System.out.println(currentElement + " " + nextElement);
                }
            }

        }
    }
}
