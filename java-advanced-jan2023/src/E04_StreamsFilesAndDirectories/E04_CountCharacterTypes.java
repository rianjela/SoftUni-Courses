package E04_StreamsFilesAndDirectories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class E04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SoftUni\\Study-Materials\\Java-Advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = "\\input.txt";
        String outputPath = "\\output_04.txt";

        int vowelsCount = 0;
        int punctCount = 0;
        int consonantsCount = 0;

        Set<Character> vowels = getVowels();
        Set<Character> punctuationMarks = getPunktMarks();

        List<String> allLines = Files.readAllLines(Path.of(path+inputPath));

        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSym = line.charAt(i);
                if (currentSym == ' ') {
                    continue;
                }

                if (vowels.contains(currentSym)){
                    vowelsCount++;
                } else if (punctuationMarks.contains(currentSym)){
                    punctCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        BufferedWriter writer= new BufferedWriter(new FileWriter("output_04.txt"));
        writer.write("Vowels: "+ vowelsCount);
        writer.newLine();
        writer.write("Other symbols: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctCount);
        writer.close();
    }

    private static Set<Character> getPunktMarks() {
        Set<Character> marks = new HashSet<>();
        marks.add('!');
        marks.add('?');
        marks.add('.');
        marks.add(',');
        return marks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
