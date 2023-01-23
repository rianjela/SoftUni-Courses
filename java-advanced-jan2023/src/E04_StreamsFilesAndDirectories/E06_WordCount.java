package E04_StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class E06_WordCount {
    public static void main(String[] args) throws IOException {

        String pathWords = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        List<String> allLinesWithWords = Files.readAllLines(Path.of(pathWords));


        //words.txt
        Map<String, Integer> countWords = new HashMap<>();
        for (String line : allLinesWithWords) {
            String[] currentLine = line.split("\\s+");
            Arrays.stream(currentLine).forEach(word -> {
                countWords.put(word, 0);
            });
        }

        //text.txt
        String pathText = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLinesWithText = Files.readAllLines(Path.of(pathText));


        for (String line : allLinesWithText) {
            line = line.replaceAll("[\\.\\,\\?\\!\\:]", "");
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word) + 1);
                }
            }
        }

        //Sort by value - descending
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt"));
        countWords.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();



    }
}
