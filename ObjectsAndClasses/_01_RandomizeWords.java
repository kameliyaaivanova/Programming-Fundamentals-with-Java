package ObjectsAndClasses;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class _01_RandomizeWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        LocalDate birthdayKameliya = LocalDate.of(2002,6,4);
//
//        System.out.println(birthdayKameliya);

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();


        Random rnd = new Random();
        int wordsSize = words.size();


        for (int i = 0; i < wordsSize; i++) {
            int randomWordIndex = rnd.nextInt(words.size());

            String randomWord = words.get(randomWordIndex);

            result.add(randomWord);
            words.remove(randomWord);
        }
        for (String string : result) {
            System.out.println(string);
        }


    }
}
