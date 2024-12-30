package Basics;

import java.util.Scanner;

public class _03_BackIn30Min {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        
        minutes += 30;

        if (minutes > 59){
            hours ++;
            minutes -= 60;
        }

        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d",hours,minutes);

    }
}
