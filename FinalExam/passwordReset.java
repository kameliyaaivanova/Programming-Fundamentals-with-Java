package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordReset {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        StringBuilder rawPassword = new StringBuilder();

        while (!command.equals("Done")){
            String[] commandAsArray = command.split("\\s");
            String commandName = commandAsArray[0];

            switch (commandName){
                case "TakeOdd":
                    for (int i = 0; i < text.length(); i++) {
                        if (i % 2 != 0){
                            char currentSymbol = text.charAt(i);
                            rawPassword.append(currentSymbol);
                        }
                    }
                    text = rawPassword;
                    System.out.println(rawPassword);
                    break;

                case "Cut":
                    int index = Integer.parseInt(commandAsArray[1]);
                    int length = Integer.parseInt(commandAsArray[2]);
                    int endIndex = index + length;
                    text.delete(index,endIndex);
                    System.out.println(text);
                    break;

                case "Substitute":
                    String substring = commandAsArray[1];
                    String substitute = commandAsArray[2];
                    if (text.toString().contains(substring)){
                        text = new StringBuilder(text.toString().replace(substring,substitute));
                        System.out.println(text);
                    }else {
                        System.out.println("Nothing to replace!");

                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",text);
    }
}
