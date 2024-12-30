package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _04_SumOfChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 1. poluchavame kolko broq elementi shte imame
        // 2. poluchavame vseki edin element
        // 3. iskame da namerim sbora ot elementite spored aski tablicata

        //. zapochvame s for cikul za da minem prez vseki edin element
        // vzimame pyrviq element i ot string go preobrazuvame v int
        //. kato vzemem konkretniq element trqbva da pribavim negovata suma kum nova promenliva SUMA
        //. posledno printirvame rezultata

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numberOfLines ; i++) {
            String letters = scanner.nextLine();

            int lettersInInt = letters.charAt(0);

            sum += lettersInInt;

        }

        System.out.printf("The sum equals: %d",sum);





    }
}
