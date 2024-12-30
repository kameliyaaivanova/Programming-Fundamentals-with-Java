package FinalExam;

import java.util.Scanner;

public class _11_5_PasswordReset {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());


        String input = scanner.nextLine();


        while (!input.equals("Done")){
            
            if (input.contains("TakeOdd")){
                StringBuilder newWord = new StringBuilder();
                for (int i = 0; i < password.length(); i++) {
                    if (i % 2 != 0){
                        newWord.append(password.charAt(i));
                    }
                }
                password = newWord;
                System.out.println(newWord);

            }else if (input.contains("Cut")){
                int index = Integer.parseInt(input.split(" ")[1]);
                int length = Integer.parseInt(input.split(" ")[2]);
                int endIndex = index + length;
                password.delete(index,endIndex);
                System.out.println(password);

                
            } else if (input.contains("Substitute")) {
                String substring = input.split(" ")[1];
                String newSubstitute = input.split(" ")[2];

                if (password.toString().contains(substring)){
                    password = new StringBuilder(password.toString().replace(substring,newSubstitute));
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Your password is: " + password);


    }
}
