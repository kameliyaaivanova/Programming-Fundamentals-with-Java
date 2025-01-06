package AssociativeArraysExercises;

import java.util.*;

public class _10_ThePianist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfPieces; i++) {

            String input = scanner.nextLine();
            String[] inputAsArray = input.split("\\|");
            String piece = inputAsArray[0];
            String composer = inputAsArray[1];
            String key = inputAsArray[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);
            piecesMap.put(piece, pieceInfo);

        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String[] commandAsArray = command.split("\\|");
            String currentCommand = commandAsArray[0];

            if (currentCommand.equals("Add")) {
                String piece = commandAsArray[1];
                String composer = commandAsArray[2];
                String key = commandAsArray[3];
                if (piecesMap.containsKey(piece)) {
                    System.out.printf("%s is already in the collection!%n", piece);
                } else {
                    List<String> info = new ArrayList<>();
                    info.add(composer);
                    info.add(key);
                    piecesMap.put(piece, info);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                }

            } else if (currentCommand.equals("Remove")) {
                String piece = commandAsArray[1];
                if (piecesMap.containsKey(piece)) {
                    piecesMap.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (currentCommand.equals("ChangeKey")) {
                String piece = commandAsArray[1];
                String newKey = commandAsArray[2];
                if (piecesMap.containsKey(piece)) {
                    List<String> currentKey = piecesMap.get(piece);
                    currentKey.remove(1);
                    currentKey.add(newKey);
                    piecesMap.put(piece, currentKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : piecesMap.entrySet()) {
            String piece = entry.getKey();
            String composer = entry.getValue().get(0);
            String key = entry.getValue().get(1);
            System.out.printf("%s -> Composer: %s, Key: %s%n", piece, composer, key);
        }
    }
}
