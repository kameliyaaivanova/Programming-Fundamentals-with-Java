package AssociativeArraysExercises;

import java.util.*;

public class _06_StudentAcademy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsList = new LinkedHashMap<>();

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfStudents; i++) {

            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (studentsList.containsKey(name)) {
                List<Double> currentGrade = studentsList.get(name);
                currentGrade.add(grade);
            } else {
                studentsList.put(name, new ArrayList<>());
                studentsList.get(name).add(grade);
            }
        }

        Map<String, Double> averageStudentsGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> currentStudent : studentsList.entrySet()) {
            String name = currentStudent.getKey();
            List<Double> grade = currentStudent.getValue();
            double averageGrade = getAverageGrade(grade);

            if (averageGrade >= 4.50) {
                averageStudentsGrade.put(name, averageGrade);
            }
        }

        for (Map.Entry<String, Double> kvp : averageStudentsGrade.entrySet()) {
            System.out.printf("%s -> %.2f%n", kvp.getKey(), kvp.getValue());
        }
    }

    private static double getAverageGrade(List<Double> grade) {
        double sum = 0;

        for (double currentGrade : grade) {
            sum += currentGrade;
        }
        return sum / grade.size();
    }
}
