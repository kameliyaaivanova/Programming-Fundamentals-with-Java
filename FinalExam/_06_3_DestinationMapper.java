package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_3DestinationMapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        List<String> destinations = new ArrayList<>();

        Pattern pattern = Pattern.compile("(={1}|\\/{1})(?<destination>[A-Z][a-zA-Z]{2,})\\1");
        Matcher matcher = pattern.matcher(text);
        int destinationLength = 0;

        while (matcher.find()){
            String destination = matcher.group("destination");
            if (!destinations.contains(destination)) {
                destinations.add(destination);
                int currentLength = destination.length();
                destinationLength += currentLength;
            }
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinations));
        System.out.printf("Travel Points: %d",destinationLength);
    }
}