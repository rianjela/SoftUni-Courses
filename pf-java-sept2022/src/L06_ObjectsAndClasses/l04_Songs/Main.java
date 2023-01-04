package L06_ObjectsAndClasses.l04_Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> allSongsList = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] songDataArr = scanner.nextLine().split("_");

            String typeList = songDataArr[0];
            String nameSong = songDataArr[1];
            String timeSong = songDataArr[2];

            Song song = new Song();

            song.setSong(typeList, nameSong, timeSong);
            allSongsList.add(song);
        }

        String typeSonsToPrint = scanner.nextLine();

        for (Song song : allSongsList) {

            if (song.getTypeList().equals(typeSonsToPrint) || typeSonsToPrint.equals("all")) {
                System.out.println(song.getName());
            }
        }
    }
    }
