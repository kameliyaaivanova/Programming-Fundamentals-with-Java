package RegularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MatchPhoneNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String phoneNumber = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b");
        Matcher matcher = pattern.matcher(phoneNumber);

        List<String> newPhoneNum = new ArrayList<>();
        while (matcher.find()) {
            newPhoneNum.add(matcher.group());
        }
        System.out.println(String.join(", ", newPhoneNum));
    }
}
