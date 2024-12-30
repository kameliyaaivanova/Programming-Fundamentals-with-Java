package AssociativeArraysExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_SoftUniParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,String> register = new LinkedHashMap<>();

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfCommands ; i++) {
            String command = scanner.nextLine();
            String [] commandAsArr = command.split(" ");
            String commandName = commandAsArr[0];
            String username = commandAsArr[1];

            switch (commandName){
                case "register":
                    String licensePlateNumber = commandAsArr[2];
                    if (register.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s%n",register.get(username));
                    } else {
                        register.put(username,licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n",username,licensePlateNumber);
                    }
                    break;

                case "unregister":
                    if (!register.containsKey(username)){
                        System.out.printf("ERROR: user %s not found%n",username);
                    } else {
                        register.remove(username);
                        System.out.printf("%s unregistered successfully%n",username);
                    }
                    break;
            }
        }

        for (Map.Entry<String,String> kvp : register.entrySet()) {
            System.out.printf("%s => %s%n",kvp.getKey(),kvp.getValue());
        }



    }
}
