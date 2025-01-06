package DataTypesAndVariables;

import java.util.Scanner;

public class _07_ReversedChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstInput = scanner.nextLine().charAt(0);
        char secondInput = scanner.nextLine().charAt(0);
        char thirdInput = scanner.nextLine().charAt(0);
        System.out.println(""+thirdInput+" "+secondInput+" "+firstInput);
    }
}
