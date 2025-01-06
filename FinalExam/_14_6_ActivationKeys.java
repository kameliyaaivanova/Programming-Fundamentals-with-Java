package FinalExam;

import java.util.Scanner;

public class _14_6_ActivationKeys {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")){
            String[] inputAsArray = input.split(">>>");
            String command = inputAsArray[0];
            switch (command){
                case "Contains":
                    String substring = inputAsArray[1];
                    if (activationKey.toString().contains(substring)){
                        System.out.printf("%s contains %s%n",activationKey,substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String symbolCase = inputAsArray[1];
                    int startIndex = Integer.parseInt(inputAsArray[2]);
                    int endIndex = Integer.parseInt(inputAsArray[3]);
                    String currentSubstring = activationKey.substring(startIndex, endIndex);
                    if (symbolCase.equals("Upper")){
                        activationKey = new StringBuilder(activationKey.replace(startIndex, endIndex,currentSubstring.toUpperCase()));
                        System.out.println(activationKey);
                    } else if (symbolCase.equals("Lower")){
                        activationKey = new StringBuilder(activationKey.replace(startIndex, endIndex,currentSubstring.toLowerCase()));
                        System.out.println(activationKey);
                    }
                    break;
                case "Slice":
                    int sliceStartIndex = Integer.parseInt(inputAsArray[1]);
                    int sliceEndIndex = Integer.parseInt(inputAsArray[2]);
                    activationKey.delete(sliceStartIndex,sliceEndIndex);
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey);
    }
}