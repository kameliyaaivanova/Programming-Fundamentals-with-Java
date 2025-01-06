package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _09_4_MirrorWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(@|#)(?<firstWord>[A-Za-z]{3,})(\\1)(\\1)(?<secondWord>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorWords = new ArrayList<>();
        int numberOfPairs = 0;

        while (matcher.find()){
            numberOfPairs++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String reversedWord = new StringBuilder(secondWord).reverse().toString();
            if (firstWord.equals(reversedWord)){
                mirrorWords.add(firstWord + " <=> " + secondWord);
            }
        }

        if (numberOfPairs == 0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!%n", numberOfPairs);
        }

        if (mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        }else {
            System.out.println("The mirror words are:");
            System.out.print(String.join(", ", mirrorWords));
            }
        }
    }