package BasicsExercises;

import java.util.Scanner;

public class _11_RageExpenses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double extraPriceForHeadset = (lostGamesCount / 2) * headsetPrice;
        double extraPriceForMouse = (lostGamesCount / 3) * mousePrice;
        double extraPriceForKeyboard = (lostGamesCount / 6) * keyboardPrice;
        double extraPriceForDisplay = (lostGamesCount/12) * displayPrice;

        double totalPrice = extraPriceForHeadset + extraPriceForMouse + extraPriceForDisplay + extraPriceForKeyboard;
        System.out.printf("Rage expenses: %.2f lv.",totalPrice);




    }
}
