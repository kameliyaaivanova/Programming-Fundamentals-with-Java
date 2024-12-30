package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // daden ni e masiv ot chisla
        //1. pravq for loop za da mina prez vsichki chisla
        //2. vzimam purvoto chislo ot masiva
        //3. vzimam sledvashtoto chislo ot masiva
        //4. subiram dvete chisla, kato novopoluchenoto chislo go slagam na mqstoto na purvoto chislo
        //5. vzetoto vtoro chuslo go subiram sus sledvashtoto i go postavqm na mqstoto na vtoroto i tn

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int positions = numbers.length - 1;

        while (positions > 0) {

            for (int i = 0; i < numbers.length - 1; i++) {
                int sum = numbers[i] + numbers[i + 1];
                numbers[i] = sum;
            }
            positions--;
        }

        System.out.println(numbers[0]);
    }
}
