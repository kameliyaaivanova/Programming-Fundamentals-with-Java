package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _12_HeartDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer > houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int currentIndex = 0;

        while (!input.equals("Love!")){
            String command = input.split(" ")[0];
            int length = Integer.parseInt(input.split(" ")[1]);

            if (command.contains("Jump")){
                currentIndex += length;

                if (currentIndex > houses.size() - 1){
                    currentIndex = 0;
                }

                   int currentHouse =  houses.get(currentIndex);

                   if (currentHouse != 0 ){
                       currentHouse -= 2;
                       houses.set(currentIndex,currentHouse);
                       if (currentHouse == 0){
                           System.out.printf("Place %d has Valentine's day.%n",currentIndex);
                       }

                   }else {
                       System.out.printf("Place %d already had Valentine's day.%n", currentIndex);

                   }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n",currentIndex);
       int failedHouses = 0;
       boolean isFailed = false;

        for (int house :houses) {

            if (house != 0){
              isFailed = true;
              failedHouses++;
            }

        }

        if (isFailed){
            System.out.printf("Cupid has failed %d places.%n", failedHouses);
        } else {
            System.out.println("Mission was successful.");
        }



    }
}
