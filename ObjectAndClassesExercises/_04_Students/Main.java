package ObjectAndClassesExercises._04_Students;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        int countOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countOfStudents; i++) {
            String[] studentInformation = scanner.nextLine().split(" ");

            String firstName = studentInformation[0];
            String secondName = studentInformation[1];
            double grade = Double.parseDouble(studentInformation[2]);

            Student student = new Student(firstName, secondName, grade);
            studentList.add(student);
        }

        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
