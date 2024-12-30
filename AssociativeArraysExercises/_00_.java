package AssociativeArraysExercises;

import java.util.*;
import java.util.stream.LongStream;

public class _00_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String >> students = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!students.containsKey(courseName)){
                students.put(courseName,new ArrayList<>());
                students.get(courseName).add(studentName);
            } else {
                students.get(courseName).add(studentName);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String ,List<String >> entry:students.entrySet()) {
            String courseName = entry.getKey();
            List<String> currentStudents = entry.getValue();
            int sum = currentStudents.size();
            System.out.printf("%s: %d%n",courseName,sum);
            for (String student:currentStudents) {
                System.out.printf("-- %s%n",student);
            }
        }
    }
}
