package FinalExam;

import java.util.Scanner;

public class _04_2TheImitationGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")){
            String[] inputAsArray = input.split("\\|");
            String command = inputAsArray[0];
            switch (command){
                case "ChangeAll":
                    String substring = inputAsArray[1];
                    String replacement = inputAsArray[2];
                    encryptedMessage = new StringBuilder(encryptedMessage.toString().replace(substring, replacement));
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputAsArray[1]);
                    String value = inputAsArray[2];
                    encryptedMessage.insert(index,value);
                    break;
                case "Move":
                    int numberOfLetters = Integer.parseInt(inputAsArray[1]);
                    for (int i = 1; i <= numberOfLetters ; i++) {
                        char firstCharacter = encryptedMessage.charAt(0);
                        encryptedMessage.append(firstCharacter);
                        encryptedMessage.deleteCharAt(0);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + encryptedMessage);
    }
}