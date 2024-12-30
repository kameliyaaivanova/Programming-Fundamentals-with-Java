package Methods;

import java.util.Scanner;

public class _07_RepeatString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println(newText(text,quantity));
    }

    public static String newText (String text,int quantity){
        String[] result = new String[quantity];

        for (int i = 0; i < quantity ; i++) {
            result[i] = text;
        }
        return String.join("",result);
    }

}
