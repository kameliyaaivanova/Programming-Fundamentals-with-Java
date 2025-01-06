package BasicsExercises;

import java.util.Scanner;

public class _05_Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String username = scanner.nextLine();
       String password = "";

        for (int i = username.length() - 1; i >= 0 ; i--) {
            password += username.charAt(i);
        }

        String enteredPassword = scanner.nextLine();
        int numberOfIncorrectPasswords = 0;
        while (!enteredPassword.equals(password)){
            numberOfIncorrectPasswords++;
            if (numberOfIncorrectPasswords == 4){
                System.out.printf("User %s blocked!",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.",username);
    }
}