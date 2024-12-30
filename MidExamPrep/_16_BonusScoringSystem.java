package MidExamPrep;

import java.util.Scanner;

public class _16_BonusScoringSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = Double.MIN_VALUE;
        int attendance = 0;


        for (int i = 0; i < numberOfStudents ; i++) {
            int attendanceOfCurrentStudent = Integer.parseInt(scanner.nextLine());

           double totalBonus = ((double) attendanceOfCurrentStudent) / numberOfLectures * (5 + additionalBonus);

            if (totalBonus > maxBonus){
                maxBonus =  totalBonus;
                attendance = attendanceOfCurrentStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",(maxBonus));
        System.out.printf("The student has attended %d lectures.",attendance);

    }
}
