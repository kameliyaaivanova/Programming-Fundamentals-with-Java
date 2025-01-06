package BasicsExercises;

import java.util.Scanner;

public class _10_PadawanEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());
        double moneyForRobes = (priceOfRobes * countOfStudents);
        double moneyForBelts = (countOfStudents - (countOfStudents / 6)) * priceOfBelt;
        double moneyForLightsabers = Math.ceil(countOfStudents * 1.10) * priceOfLightsabers;
        double totalSum = moneyForLightsabers + moneyForRobes + moneyForBelts;

        if (totalSum <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalSum - amountOfMoney);
        }
    }
}
