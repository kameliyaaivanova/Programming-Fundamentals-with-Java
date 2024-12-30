package MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_3_Exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> books = Arrays.stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());
        
        String input = scanner.nextLine();
        
        while (!input.equals("Done")){
            String[] command = input.split(" \\| ");
            String nameCommand = command[0];
            
            if (nameCommand.equals("Add Book")){
                String bookName = command[1];
                if (!books.contains(bookName)){
                    books.add(0,bookName);
                }

            } else if (nameCommand.equals("Take Book")) {
                String bookName = command[1];
                books.remove(bookName);
                
            } else if (nameCommand.equals("Swap Books")) {
                String firstBook = command[1];
                String secondBook = command[2];

                if (books.contains(firstBook) && books.contains(secondBook)){
                    int firstBookIndex = books.indexOf(firstBook);
                    int secondBookIndex = books.indexOf(secondBook);
                    books.set(firstBookIndex,secondBook);
                    books.set(secondBookIndex,firstBook);
                }

            } else if (nameCommand.equals("Insert Book")) {
                String bookName = command[1];
                if (!books.contains(bookName)){
                books.add(bookName);
                }
                
            } else if (nameCommand.equals("Check Book")) {
                int bookIndex = Integer.parseInt(command[1]);
                if (bookIndex >= 0 && bookIndex < books.size()){
                    String bookName = books.get(bookIndex);
                    System.out.println(bookName);

                }
            }


            input = scanner.nextLine();

        }

        System.out.print(books.toString()
                .replace("[", "")
                .replace("]", ""));
    
    }
}
