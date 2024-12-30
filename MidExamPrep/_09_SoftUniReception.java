package MidExamPrep;

import java.util.Scanner;

public class _09_SoftUniReception {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hoursSum = 0;

        while (studentsCount > 0){
            hoursSum++;
            if ( hoursSum % 4 == 0){
                continue;

            }else {
                studentsCount -= firstEmployeeEfficiency;
                studentsCount -= secondEmployeeEfficiency;
                studentsCount -= thirdEmployeeEfficiency;
            }


        }
        System.out.printf("Time needed: %dh.",hoursSum);
    }
}
