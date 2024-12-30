package AssociativeArrays;

import java.util.*;

public class _03_OddOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        LinkedHashMap<String,Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)){
                wordsMap.put(word,wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word,1);
            }

        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<String,Integer> kvg : wordsMap.entrySet()) {
            if (kvg.getValue() % 2 != 0){
                result.add(kvg.getKey());

            }
        }

        System.out.print(String.join(", ",result));
    }
}
