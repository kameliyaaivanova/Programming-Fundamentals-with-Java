package AssociativeArraysExercises;

import java.util.*;

public class _08_CompanyUsers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> mapFromCompany = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputAsArray = input.split(" -> ");
            String companyName = inputAsArray[0];
            String employeeId = inputAsArray[1];

            if (!mapFromCompany.containsKey(companyName)) {
                mapFromCompany.put(companyName, new ArrayList<>());
                mapFromCompany.get(companyName).add(employeeId);
            } else {
                if (!mapFromCompany.get(companyName).contains(employeeId)) {
                    mapFromCompany.get(companyName).add(employeeId);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> kvp : mapFromCompany.entrySet()) {
            System.out.println(kvp.getKey());
            kvp.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }
    }
}
