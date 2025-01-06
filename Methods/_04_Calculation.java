package Methods;

import java.util.Scanner;

public class _04_Calculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        if (command.equals("add")){
            add(num1,num2);
        } else if (command.equals("multiply")) {
            multiply(num1,num2);
        } else if (command.equals("subtract")) {
            subtract(num1,num2);
        } else {
            divide(num1,num2);
        }
    }

    public static void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }

    public static void multiply(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }

    public static void subtract(int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
    }

    public static void divide(int num1, int num2){
        int result = num1 / num2;
        System.out.println(result);
    }
}