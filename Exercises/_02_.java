package Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPasswords = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfPasswords ; i++) {
            String password = scanner.nextLine();

            Pattern pattern = Pattern.compile("(.+)(>)(?<firstGroup>[0-9]{3})\\|(?<secondGroup>[a-z]{3})\\|(?<thirdGroup>[A-Z]{3})\\|(?<fourthGroup>[^<>]{3})(<)\\1");
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()){
                String firstGroup = matcher.group("firstGroup");
                String secondGroup = matcher.group("secondGroup");
                String thirdGroup = matcher.group("thirdGroup");
                String fourthGroup = matcher.group("fourthGroup");

                String encryptedPassword = firstGroup + secondGroup  + thirdGroup + fourthGroup;
                System.out.printf("Password: %s%n",encryptedPassword);

            }else {
                System.out.println("Try another password!");
            }




        }
    }
}
