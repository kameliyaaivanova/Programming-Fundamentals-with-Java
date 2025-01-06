package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _10_4_NeedForSpeed3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> carMileage = new LinkedHashMap<>();
        Map<String,Integer> carFuel = new LinkedHashMap<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfCars ; i++) {
            String cars = scanner.nextLine();
            String carBrand = cars.split("\\|")[0];
            int mileage = Integer.parseInt(cars.split("\\|")[1]);
            int fuel = Integer.parseInt(cars.split("\\|")[2]);
            carMileage.putIfAbsent(carBrand,mileage);
            carFuel.putIfAbsent(carBrand,fuel);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String command = input.split(" : ")[0];
            String car = input.split(" : ")[1];
            switch (command){
                case "Drive":
                    int distance = Integer.parseInt(input.split(" : ")[2]);
                    int fuel = Integer.parseInt(input.split(" : ")[3]);
                    int currentFuel = carFuel.get(car);
                    if (currentFuel < fuel){
                        System.out.println("Not enough fuel to make that ride");
                    }else {
                        currentFuel-= fuel;
                        carFuel.put(car,currentFuel);
                        int currentMileage = carMileage.get(car);
                        currentMileage += distance;
                        carMileage.put(car,currentMileage);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",car,distance,fuel);
                    }
                    if (carMileage.get(car) >= 100000){
                        System.out.printf("Time to sell the %s!%n",car);
                        carMileage.remove(car);
                        carFuel.remove(car);
                    }
                    break;
                case "Refuel":
                    int fuelToRefuel = Integer.parseInt(input.split(" : ")[2]);
                    int currentCarFuel = carFuel.get(car);
                    currentCarFuel += fuelToRefuel;
                    if (currentCarFuel > 75){
                        currentCarFuel = 75;
                        System.out.printf("%s refueled with %d liters%n",car,currentCarFuel - carFuel.get(car));
                        carFuel.put(car,currentCarFuel);
                    }else {
                        System.out.printf("%s refueled with %d liters%n",car,fuelToRefuel);
                        carFuel.put(car,currentCarFuel);
                    }
                    break;
                case "Revert":
                    int kilometersToRevert = Integer.parseInt(input.split(" : ")[2]);
                    int currentMileage = carMileage.get(car);
                    currentMileage -= kilometersToRevert;
                    if (currentMileage < 10000){
                        currentMileage = 10000;
                        carMileage.put(car,currentMileage);
                    } else {
                        carMileage.put(car,currentMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kilometersToRevert);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String,Integer> entry : carMileage.entrySet()){
            String car = entry.getKey();
            int mileage = entry.getValue();
            int fuel = carFuel.get(car);
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",car,mileage,fuel);
        }
    }
}