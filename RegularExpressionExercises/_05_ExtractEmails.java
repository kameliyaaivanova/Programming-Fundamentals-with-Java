package RegularExpressionExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _05_ExtractEmails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regexUser = "(?<user>[A-Za-z0-9]+[\\.\\-\\_]?[A-Za-z0-9]+)";
        String regexHost = "(?<host>[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\.?[A-Za-z]+)+)";
        String regex = regexUser + "@" + regexHost;

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
