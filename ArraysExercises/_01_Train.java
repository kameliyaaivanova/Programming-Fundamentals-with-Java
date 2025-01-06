package ArraysExercises;

import java.util.Scanner;

public class _01_Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] peopleInWagon = new int[wagons];
        int sum = 0;

        for (int i = 0; i <= wagons - 1; i++) {
            int numOfPeople = Integer.parseInt(scanner.nextLine());
            peopleInWagon[i] = numOfPeople;
            sum += numOfPeople;
        }

        for (int wagon : peopleInWagon) {
            System.out.print(wagon + " ");
        }

        System.out.println();
        System.out.println(sum);




    }
}
