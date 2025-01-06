package AssociativeArrays;

import java.util.*;

public class _02_WordSynonyms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, List<String>> synonyms = new LinkedHashMap<>();

        int wordsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= wordsCount; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)){
                synonyms.put(word,new ArrayList<>());
            }
            synonyms.get(word).add(synonym);
        }

        for (Map.Entry<String,List<String>> kvp : synonyms.entrySet()) {
            System.out.printf("%s - %s%n",kvp.getKey(),
                    String.join(", ", kvp.getValue()));
        }
    }
}
