package FinalExam;

import java.util.Scanner;

public class _01_1WorldTour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")){
            String[] inputAsArray = input.split(":");
            String command = inputAsArray[0];
            switch (command){
                case "Add Stop":
                    int index = Integer.parseInt(inputAsArray[1]);
                    String city = inputAsArray[2];
                    if (index >= 0 && index < stops.length()){
                       stops.insert(index,city);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(inputAsArray[1]);
                    int endIndex = Integer.parseInt(inputAsArray[2]);
                    if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()){
                       stops.delete(startIndex,endIndex + 1);
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldCity = inputAsArray[1];
                    String newCity = inputAsArray[2];
                    if (!oldCity.equals(newCity)){
                        if (stops.toString().contains(oldCity)){
                            stops = new StringBuilder(stops.toString().replace(oldCity, newCity));
                        }
                    }
                    System.out.println(stops);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print("Ready for world tour! Planned stops: " + stops);
    }
}