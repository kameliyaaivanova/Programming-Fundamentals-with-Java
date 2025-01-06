package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_1EmojiDetector {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern patternNumber = Pattern.compile("\\d");
        Pattern patternEmoji = Pattern.compile("(:{2}|\\*{2})(?<emoji>[A-Z][a-z]{2,})\\1");
        Matcher matcherNumber = patternNumber.matcher(text);

        long sum = 1;

        while (matcherNumber.find()){
            int number = Integer.parseInt(matcherNumber.group());
            sum *= number;
        }

        List<String> emojis = new ArrayList<>();
        Matcher matcherEmoji = patternEmoji.matcher(text);

        int countOfEmojis = 0;

        while (matcherEmoji.find()){
            String emoji = matcherEmoji.group("emoji");
            countOfEmojis++;
            long sumEmojis = 0;
            for (char symbol: emoji.toCharArray()) {
                sumEmojis += symbol;
            }
            if (sumEmojis > sum){
                String wholeEmoji = matcherEmoji.group();
                emojis.add(wholeEmoji);
            }
        }
        System.out.println("Cool threshold: " + sum);
        System.out.println( countOfEmojis + " emojis found in the text. The cool ones are: ");
        for (String emoji : emojis) {
            System.out.println(emoji);
        }
    }
}
