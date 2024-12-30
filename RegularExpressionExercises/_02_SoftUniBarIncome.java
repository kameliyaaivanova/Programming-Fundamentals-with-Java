package RegularExpressionExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUniBarIncome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSum = 0;

        while (!input.equals("end of shift")){

            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<product>\\w+)>[^\\|\\$%\\.]*\\|(?<count>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$");
            Matcher matcher = pattern.matcher(input);


            while (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count * price;

                System.out.printf("%s: %s - %.2f%n",name,product,sum);

                totalSum += sum;


            }
            input = scanner.nextLine();

        }
        System.out.printf("Total income: %.2f",totalSum);

    }
}
