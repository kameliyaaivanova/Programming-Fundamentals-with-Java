package DataTypesandVariablesExercises;

import javax.management.InstanceNotFoundException;
import java.util.Scanner;

public class _01_IntegerOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int addedNumbers = number1+number2;
        int dividedNumbers = addedNumbers/number3;
        int multipliedNumbers = dividedNumbers*number4;
        System.out.println(multipliedNumbers);
    }
}
