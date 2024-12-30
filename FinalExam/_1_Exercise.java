package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();

        while (!commands.equals("Complete")){

            String[] commandParts = commands.split("\\s");
            String commandName = commandParts[0];

            switch (commandName){
                case "Make":
                    String secondPart = commandParts[1];
                    int index = Integer.parseInt(commandParts[2]);

                    if (secondPart.equals("Upper")){
                        char symbolToReplace = password.charAt(index);
                        symbolToReplace = Character.toUpperCase(symbolToReplace);
                        password.setCharAt(index,symbolToReplace);
                        System.out.println(password);

                    } else if (secondPart.equals("Lower")) {
                        char symbolToReplace = password.charAt(index);
                        symbolToReplace = Character.toLowerCase(symbolToReplace);
                        password.setCharAt(index,symbolToReplace);
                        System.out.println(password);
                    }
                    break;

                case "Insert":
                    int indexToInsert = Integer.parseInt(commandParts[1]);
                    String symbolToInsert = commandParts[2];

                    if (indexToInsert < 0 && indexToInsert > password.length()){
                        break;
                    } else {
                        password.insert(indexToInsert,symbolToInsert);
                        System.out.println(password);
                    }
                    break;

                case "Replace":
                    char symbolToReplace = commandParts[1].charAt(0);
                    String symbolToReplaceAsString = commandParts[1];
                    int valueToReplace = Integer.parseInt(commandParts[2]);
                    int valueFromAscii = symbolToReplace;
                    int sum = valueToReplace + valueFromAscii;
                    char newSymbol = (char) sum;

                    if (password.toString().contains(symbolToReplaceAsString)){
                        password = new StringBuilder(password.toString().replace(symbolToReplaceAsString,String.valueOf(newSymbol)));
                        System.out.println(password);
                    }else {
                        break;
                    }
                    break;
                case "Validation":
                    String firstRegex = "\\w+";
                    Pattern pattern = Pattern.compile(firstRegex);
                    Matcher matcher = pattern.matcher(password);

                    String secondRegex = "\\d+";
                    Pattern pattern2 = Pattern.compile(secondRegex);
                    Matcher matcher2 = pattern2.matcher(password);

                    if (password.length() < 8){
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    if (!matcher.find()){
                        System.out.println("Password must consist only of letters, digits and _!");
                    }  if (password.toString().chars().noneMatch(Character::isUpperCase)) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }  if (password.toString().chars().noneMatch(Character::isLowerCase)) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }  if (!matcher2.find()) {
                        System.out.println("Password must consist at least one digit!");
                    }
                    break;

            }
            commands = scanner.nextLine();
        }

    }
}
