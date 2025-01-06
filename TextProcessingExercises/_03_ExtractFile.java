package TextProcessingExercises;

import java.util.Scanner;

public class _03_ExtractFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] file = scanner.nextLine().split("\\\\");
        String fileNameAndExtension = file[file.length - 1];
        String[] fileNameAndExtensionAsArray = fileNameAndExtension.split("\\.");
        String fileName = fileNameAndExtensionAsArray[0];
        String extension = fileNameAndExtensionAsArray[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", extension);
    }
}
