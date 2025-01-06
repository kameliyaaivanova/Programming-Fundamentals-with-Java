package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (numberOfPeople < capacity){
            System.out.println("1");
        } else {
            int numberOfCourses = (int) Math.ceil((double) numberOfPeople / capacity);
            System.out.println(numberOfCourses);
        }
    }
}
