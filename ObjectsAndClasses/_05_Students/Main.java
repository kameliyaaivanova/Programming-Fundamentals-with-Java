package ObjectsAndClasses._05_Students;

import ObjectsAndClasses._06_Students_2.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] studentsInformation = command.split(" ");

            String name = studentsInformation[0];
            String secondName = studentsInformation[1];
            String age = studentsInformation[2];
            String city = studentsInformation[3];


            Student student = new Student(name,secondName,age,city);

            students.add(student);

            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(cityName)){
                System.out.printf("%s %s is %s years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }

        }
    }
}
