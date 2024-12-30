package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _17_7_DestinationMapper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> destinations = new ArrayList<>();

        String places = scanner.nextLine();

        Pattern pattern = Pattern.compile("(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(places);

        int travelPoint = 0;

        while (matcher.find()){
            String destinationName = matcher.group("destination");
            destinations.add(destinationName);
            int nameSize = destinationName.length();
            travelPoint += nameSize;
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ",destinations));
        System.out.println("Travel Points: " + travelPoint);

    }
}
