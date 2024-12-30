package DataTypesAndVariables;

import java.util.Scanner;

public class _08_LowerOrUpper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals(input.toUpperCase())){
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
