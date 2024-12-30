package AssociativeArrays;

import java.util.*;

public class _00_ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       String[] words = Arrays.stream(scanner.nextLine().split(" "))
               .filter(e -> e.length() % 2 == 0)
               .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }



    }
}