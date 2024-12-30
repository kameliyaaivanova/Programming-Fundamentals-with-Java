package RegularExpressionExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ValidPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("_\\.+(?<password>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+");
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String password = matcher.group("password");
                StringBuilder numbers = new StringBuilder();
                for (char symbol:password.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        numbers.append(symbol);
                    }
                }

                if (numbers.length() == 0){
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + numbers);
                }


            }else {
                System.out.println("Invalid pass!");
            }
        }

    }
}
