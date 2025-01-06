package FinalExam;

import java.util.Scanner;

public class _08_4_SecretChat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")){
            String[] inputAsArray = input.split(":\\|:");
            String command = inputAsArray[0];
            switch (command){
                case "InsertSpace":
                    int index = Integer.parseInt(inputAsArray[1]);
                   word.insert(index," ");
                    System.out.println(word);
                    break;
                case "Reverse":
                    String substring = (inputAsArray[1]);
                    if (word.toString().contains(substring)){
                        int startIndexOfSubstring = word.indexOf(substring);
                        int endIndex = startIndexOfSubstring + substring.length();
                        word.delete(startIndexOfSubstring,endIndex);
                        String reversedWord = new StringBuilder(substring).reverse().toString();
                        word.append(reversedWord);
                        System.out.println(word);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringForChange = inputAsArray[1];
                    String replacement = inputAsArray[2];
                    word = new StringBuilder(word.toString().replaceAll(substringForChange,replacement));
                    System.out.println(word);
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + word);
    }
}
