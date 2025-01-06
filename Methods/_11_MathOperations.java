package Methods;

import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());

        if (operator.equals("*")){
            System.out.println(multiplyOperation(number1,number2));
        } else if (operator.equals("+")) {
            System.out.println(addingOperation(number1,number2));
        } else if (operator.equals("-")){
            System.out.println(subtractingOperation(number1,number2));
        } else if (operator.equals("/")) {
            System.out.println(divisionOperation(number1,number2));
        }
    }
    public static int multiplyOperation(int number1, int number2){
        return number1 * number2;
    }
    public static int addingOperation(int number1, int number2){
        return number1 + number2;
    }
    public static int subtractingOperation(int number1, int number2){
        return number1 - number2;
    }
    public static int divisionOperation(int number1, int number2){
        return number1 / number2;
    }
}