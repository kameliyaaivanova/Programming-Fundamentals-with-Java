package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Complete")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Make":
                    String secondPart  = commandParts[1];
                    int index = Integer.parseInt(commandParts[2]);

                    if (secondPart.equals("Upper")) {
                        char symbolToReplace = password.charAt(index);
                        symbolToReplace = Character.toUpperCase(symbolToReplace);
                        password.setCharAt(index, symbolToReplace);
                        System.out.println(password);
                    } else if (secondPart.equals("Lower")) {
                        char symbolToReplace = password.charAt(index);
                        symbolToReplace = Character.toLowerCase(symbolToReplace);
                        password.setCharAt(index, symbolToReplace);
                        System.out.println(password);
                    }
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(commandParts[1]);
                    String symbolToInsert = commandParts[2];
                    char charInsert = symbolToInsert.charAt(0);
                    int lastIndex = password.length() - 1;
                    if (indexToInsert < 0 || indexToInsert > lastIndex) {
                        break;
                    } else {
                        password.insert(indexToInsert, charInsert);
                        System.out.println(password);
                    }
                    break;
                case "Replace":
                    char symbolToReplace = commandParts[1].charAt(0);
                    String replace = commandParts[1];
                    int value = Integer.parseInt(commandParts[2]);
                    int valueFromAscii = symbolToReplace;
                    int sum = valueFromAscii + value;
                    char newSymbol = (char) sum;

                    if (password.toString().contains(replace)) {
                        while (password.toString().contains(replace)) {
                            String text = password.toString().replace(replace, String.valueOf(newSymbol));
                            password.replace(0, password.length(), text);
                            System.out.println(password);
                        }
                    } else {
                        break;
                    }
                    break;
                case "Validation":
                    String regex1 = "\\w+";
                    Pattern pattern1 = Pattern.compile(regex1);
                    Matcher matcher1 = pattern1.matcher(password);

                    String regex2 = "\\d+";
                    Pattern pattern2 = Pattern.compile(regex1);
                    Matcher matcher2 = pattern2.matcher(password);

                    if (password.length() < 8) {
                    System.out.println("Password must be at least 8 characters long!");
                }  if (!matcher1.find()) {
                    System.out.println("Password must consist only of letters, digits and _!");

                }  if (password.toString().chars().noneMatch(Character::isUpperCase)) {
                    System.out.println("Password must consist at least one uppercase letter!");
                }  if (password.toString().chars().noneMatch(Character::isLowerCase)) {
                    System.out.println("Password must consist at least one lowercase letter!");
                }  if (!matcher2.find()) {
                    System.out.println("Password must consist at least one digit!");
                }
                break;

                default:
                    break;
            }
            command = scanner.nextLine();
        }
    }
}