package DataTypesandVariablesExercises;

import java.util.Scanner;

public class _05_PrintPartOfTheASCIITable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1 poluchavame nachalnoto chislo na elementite,
        // koito trqbva printirame
        // 2 poluchavame krainoto chislo na elementite,
        // koito trqbva da printirame

        //1.prochitame si vhodnite danni
        //2.pravim for loop, s koito shte preminem prez vsqko edno chislo,
        // ot nachaloto na diapazona do negoiq krai.
        //3.preobrazuvame konkretniq element ot int v String
        //4.Printirame elementa.

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int currentElement = start; currentElement <= end ; currentElement++) {
            char currentElementInChar = (char) currentElement;
            System.out.print(currentElementInChar + " ");

        }
    }
}
