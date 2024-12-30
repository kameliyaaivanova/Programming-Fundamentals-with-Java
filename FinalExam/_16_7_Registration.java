package FinalExam;

import java.util.Scanner;

public class _16_7_Registration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder userName = new StringBuilder(scanner.nextLine());

        String commands = scanner.nextLine();
        while (!commands.equals("Registration")){
            String[] commandsParts = commands.split("\\s");
            String commandName = commandsParts[0];

            switch (commandName){
                case "Letters":
                    String caseCondition = commandsParts[1];
                    if (caseCondition.equals("Lower")){
                        userName = new StringBuilder(userName.toString().toLowerCase());
                    } else if (caseCondition.equals("Upper")) {
                        userName = new StringBuilder(userName.toString().toUpperCase());
                    }
                    System.out.println(userName);
                    break;

                case "Reverse":
                    int startIndex = Integer.parseInt(commandsParts[1]);
                    int endIndex = Integer.parseInt(commandsParts[2]);

                    if (startIndex >= 0 && startIndex < userName.length() && endIndex >= 0 && endIndex < userName.length()){
                        String currentSubstring = userName.substring(startIndex,endIndex + 1);
                        StringBuilder reversedSubstring = new StringBuilder(currentSubstring).reverse();
                        System.out.println(reversedSubstring);
                    }
                    break;

                case "Substring":
                    String substring = commandsParts[1];
                    if (userName.toString().contains(substring)){
                        int startIndexSubstring = userName.indexOf(substring);
                        int substringLength = substring.length();
                        int endIndexOfSubstring = startIndexSubstring + substringLength;
                        userName.delete(startIndexSubstring,endIndexOfSubstring);
                        System.out.println(userName);
                    }else {
                        System.out.printf("The username %s doesn't contain %s.%n",userName,substring);
                    }
                    break;

                case "Replace":
                    String symbol = commandsParts[1];
                    if (userName.toString().contains(symbol)){
                        userName = new StringBuilder(userName.toString().replaceAll(symbol,"-"));
                        System.out.println(userName);
                    }
                    break;

                case "IsValid":
                    String givenSymbol = commandsParts[1];
                    if (userName.toString().contains(givenSymbol)){
                        System.out.println("Valid username.");
                    }else {
                        System.out.printf("%s must be contained in your username.%n",givenSymbol);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }

    }
}
