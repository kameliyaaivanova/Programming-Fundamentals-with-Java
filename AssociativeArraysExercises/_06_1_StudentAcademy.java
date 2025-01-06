package AssociativeArraysExercises;

import java.util.*;

public class _06_1_StudentAcademy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(studentName)) {
                students.put(studentName, new ArrayList<>());
                students.get(studentName).add(studentGrade);
            } else {
                students.get(studentName).add(studentGrade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();

            double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
//            for (Double grade:grades) {
//                sum += grade;
//            }
//            double average = sum / grades.size();
            if (average >= 4.50) {
                System.out.printf("%s -> %.2f%n", name, average);
            }
        }
    }
}
