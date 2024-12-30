package Methods;

import java.util.Scanner;

public class _07_1_RepeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println(newText(text,quantity));
    }

    public static String newText (String text,int quantity){
        String newText = "";
        for (int i = 1; i <= quantity ; i++) {
            newText += text;
        }
        return newText;
    }
}
