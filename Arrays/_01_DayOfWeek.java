package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _01_DayOfWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());

       String[] dayOfWeek = {
               "Monday",
               "Tuesday",
               "Wednesday",
               "Thursday",
               "Friday",
               "Saturday",
               "Sunday"
       };

       if (n >= 1 && n <= 7) {
           System.out.println(dayOfWeek[n - 1]);
       } else {
           System.out.println("Invalid day!");
       }
    }
}
