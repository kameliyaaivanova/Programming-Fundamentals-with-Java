package ObjectAndClassesExercises._02_Article;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String title = articleData.split(", ")[0];
        String content = articleData.split(", ")[1];
        String author = articleData.split(", ")[2];

        Article article = new Article(title, content, author);

        int countCommands = Integer.parseInt(scanner.nextLine()); //бр. команди
        for (int count = 1; count <= countCommands; count++) {
            String command = scanner.nextLine(); //текст на командата

            String commandName = command.split(": ")[0]; // "Edit", "ChangeAuthor", "Rename"
            String commandParam = command.split(": ")[1];

            switch (commandName) {
                case "Edit":
                    article.edit(commandParam);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParam);
                    break;
                case "Rename":
                    article.rename(commandParam);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
