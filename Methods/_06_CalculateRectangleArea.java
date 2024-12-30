package Methods;

import java.util.Scanner;

public class _06_CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(area(scanner));

    }

    public static int area (Scanner scanner){
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        return width * length;


    }
}
