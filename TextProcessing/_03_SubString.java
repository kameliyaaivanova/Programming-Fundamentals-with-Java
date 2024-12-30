package TextProcessing;

import java.util.Scanner;

public class _03_SubString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(toRemove);

        while (text.contains(toRemove)) {
            text = text.replace(toRemove, "");

        }

        System.out.println(text);


    }
}
