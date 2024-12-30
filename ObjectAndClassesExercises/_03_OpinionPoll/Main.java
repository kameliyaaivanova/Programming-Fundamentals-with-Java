package ObjectAndClassesExercises._03_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String personInformation = scanner.nextLine();
            String name = personInformation.split(" ")[0];
            int age = Integer.parseInt(personInformation.split(" ")[1]);

            Person person = new Person(name,age);

            if (age > 30){
                personList.add(person);

            }
        }

        for (Person person : personList) {
            System.out.printf("%s - %d%n",person.getName(),person.getAge());
        }



    }
}
