package FinalExam;

import java.util.Scanner;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0_Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            if (isValidPassword(password)) {
                String encryptedPassword = encryptPassword(password);
                System.out.println("Password: " + encryptedPassword);
            } else {
                System.out.println("Try another password!");
            }
        }
    }

    private static boolean isValidPassword(String password) {
        String regex = "(.+)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]+)<\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    private static String encryptPassword(String password) {
        String regex = "(.+)>(\\d{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^<>]+)<\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            String digits = matcher.group(2);
            String lowercase = matcher.group(3);
            String uppercase = matcher.group(4);
            String symbols = matcher.group(5);
            return digits + lowercase + uppercase + symbols;
        }
        return "";
    }
}
