package ObjectsAndClasses._06_Students_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<ObjectsAndClasses._06_Students_2.Student> students = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] studentsInformation = command.split(" ");

            String name = studentsInformation[0];
            String secondName = studentsInformation[1];
            String age = studentsInformation[2];
            String city = studentsInformation[3];

            boolean exists = false;
            for (ObjectsAndClasses._06_Students_2.Student student : students) {
                if (student.getFirstName().equals(name) && student.getLastName().equals(secondName)){
                    student.setAge(age);
                    student.setHomeTown(city);

                    exists = true;
                    break;
                }
            }
            if (!exists) {

                ObjectsAndClasses._06_Students_2.Student student = new ObjectsAndClasses._06_Students_2.Student(name, secondName, age, city);
                students.add(student);
            }

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

