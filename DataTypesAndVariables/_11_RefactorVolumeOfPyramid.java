package DataTypesAndVariables;

import java.util.Scanner;

public class _11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double volume = 0;

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());


        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");

        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
