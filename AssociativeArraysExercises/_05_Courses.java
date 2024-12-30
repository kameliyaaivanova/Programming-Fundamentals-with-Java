package AssociativeArraysExercises;

import java.util.*;

public class _05_Courses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapOfCourses = new LinkedHashMap<>();

        while (!input.equals("end")){
            String[] inputAsArray = input.split(" : ");
            String courseName = inputAsArray[0];
            String registeredStudent = inputAsArray[1];

            if (!mapOfCourses.containsKey(courseName)){
                mapOfCourses.put(courseName,new ArrayList<>());
            }

            mapOfCourses.get(courseName).add(registeredStudent);


            input = scanner.nextLine();
        }

        for (Map.Entry<String,List<String>> kvp : mapOfCourses.entrySet()) {
            System.out.println(kvp.getKey() + ": " + kvp.getValue().size());
            kvp.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }
    }
}
