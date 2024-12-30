package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _2_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            if (isValidPassword(input)) {
                String encryptedPassword = encryptPassword(input);
                System.out.println("Password: " + encryptedPassword);
            } else {
                System.out.println("Try another password!");
            }
        }

    }

    private static boolean isValidPassword(String password) {
        String regex = "^(.+)>(\\d{3})\\|(\\p{Lower}{3})\\|(\\p{Upper}{3})\\|([^<>]+)<\\1$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private static String encryptPassword(String password) {
        String regex = ("^[^\\s<>]+>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]{3})<[^\\s<>]+$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            StringBuilder encryptedPassword = new StringBuilder();
            encryptedPassword.append(matcher.group(1));
            encryptedPassword.append(matcher.group(2));
            encryptedPassword.append(matcher.group(3));
            encryptedPassword.append(matcher.group(4));
            return encryptedPassword.toString();
        }
        return "";
    }
}
