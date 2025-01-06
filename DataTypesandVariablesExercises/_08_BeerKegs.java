package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _08_BeerKegs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int i = 1; i <= numberOfKegs; i++) {
            String modelOfKeg = scanner.nextLine();
            double radiusOfKeg = Double.parseDouble(scanner.nextLine());
            int heightOfKeg = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radiusOfKeg,2) * heightOfKeg;

           if (volume > maxVolume){
               maxVolume = volume;
               maxModel = modelOfKeg;
           }
        }
        System.out.println(maxModel);
    }
}
