package ObjectsAndClasses._04_Songs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberOfSongs ; i++) {
            List<String> currentSong = Arrays.stream(scanner.nextLine().split("_"))
                    .collect(Collectors.toList());

            String typeOfSong = currentSong.get(0);
            String nameOfSong = currentSong.get(1);
            String timeOfSong = currentSong.get(2);

            Song song = new Song(typeOfSong,nameOfSong,timeOfSong);

            songs.add(song);
        }
        String typeSong = scanner.nextLine();

        if (typeSong.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeSong)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
