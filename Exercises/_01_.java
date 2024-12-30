package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("Complete")){
            String[] commandParts = command.split("\\s");
            String commandName = commandParts[0];

            switch (commandName){
                case "Make":
                    String secondName = commandParts[1];
                    int index = Integer.parseInt(commandParts[2]);

                    if (secondName.equals("Upper")){
                        String currentSymbol = String.valueOf(password.toString().charAt(index));
                        password = new StringBuilder(password.toString().replace(currentSymbol,currentSymbol.toUpperCase()));

                    } else  {
                        String currentSymbol = String.valueOf(password.toString().charAt(index));
                        password = new StringBuilder(password.toString().replace(currentSymbol,currentSymbol.toLowerCase()));

                    }
                    System.out.println(password);
                    break;

                case "Insert":
                    int indexToInsert = Integer.parseInt(commandParts[1]);
                    String symbolToInsert = commandParts[2];

                    if (indexToInsert < 0 && indexToInsert > password.length()){
                        break;
                    }else {
                        password.insert(indexToInsert,symbolToInsert);
                        System.out.println(password);
                    }
                    break;

                case "Replace":
                    char symbolToReplaceAsChar = commandParts[1].charAt(0);
                    String symbolToReplace = commandParts[1];
                    int value = Integer.parseInt(commandParts[2]);

                    if (password.toString().contains(symbolToReplace)) {
                        int newSum = (int) symbolToReplaceAsChar + value;
                        char newSymbol = (char) newSum;
                        password = new StringBuilder(password.toString().replace(symbolToReplace,String.valueOf(newSymbol)));
                        System.out.println(password);
                    } else {
                        break;
                    }

                    break;

                case "Validation":

                    Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{8,}");
                    Matcher matcher = pattern.matcher(password);

                    if ( password.length() < 8){
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    if (!matcher.find()){
                       System.out.println("Password must consist only of letters, digits and _!");
                    }
                    if (password.toString().chars().noneMatch(Character::isUpperCase)){
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if (password.toString().chars().noneMatch(Character::isLowerCase)){
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    if (password.toString().chars().noneMatch(Character::isDigit)){
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
