package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_1ThePianist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String,String> pieceComposer = new LinkedHashMap<>();
        Map<String,String> pieceKey = new LinkedHashMap<>();

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfPieces ; i++) {
            String pieces = scanner.nextLine();
            String[] piecesAsArray = pieces.split("\\|");
            String piece = piecesAsArray[0];
            String composer = piecesAsArray[1];
            String key = piecesAsArray[2];

            pieceComposer.put(piece,composer);
            pieceKey.put(piece,key);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")){
            String[] inputAsArray = input.split("\\|");
            String command = inputAsArray[0];
            String piece = inputAsArray[1];
            switch (command){
                case "Add":
                    String composerToAdd = inputAsArray[2];
                    String keyToAdd = inputAsArray[3];
                    if (pieceComposer.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n",piece);
                    } else {
                        pieceComposer.put(piece,composerToAdd);
                        pieceKey.put(piece,keyToAdd);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composerToAdd,keyToAdd);
                    }
                    break;
                case "Remove":
                    if (pieceComposer.containsKey(piece)){
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.printf("Successfully removed %s!%n",piece);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = inputAsArray[2];
                    if (pieceKey.containsKey(piece)){
                        pieceKey.replace(piece,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",piece,newKey);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",piece);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String,String> entry : pieceComposer.entrySet()){
            String piece = entry.getKey();
            String composer = entry.getValue();
            String key = pieceKey.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);
        }
    }
}