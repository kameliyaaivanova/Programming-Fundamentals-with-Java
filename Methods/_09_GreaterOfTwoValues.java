package Methods;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")){
            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum,secondNum));
        } else if (type.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);
            System.out.println(getMax(a,b));
        }else if (type.equals("string")){
            String firstName = scanner.nextLine();
            String secondName = scanner.nextLine();
            System.out.println(getMax(firstName,secondName));
        }
    }
    public static int getMax(int firstNum,int secondNum){
        if (firstNum > secondNum){
            return firstNum;
        }else {
            return secondNum;
        }
    }
    public static char getMax(char a, char b){
        if ( a > b){
            return a;
        } else {
            return b;
        }
    }
    public static String getMax(String firstName,String secondName){
        if (firstName.compareTo(secondName) >= 0 ){
            return firstName;
        } else {
            return secondName;
        }
    }
}