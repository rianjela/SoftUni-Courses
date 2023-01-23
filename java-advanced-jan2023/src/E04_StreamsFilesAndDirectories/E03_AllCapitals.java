package E04_StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E03_AllCapitals {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = "\\input.txt";
        String outputPath = "\\output.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path + inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            List<String> allLines = Files.readAllLines(Path.of(path + inputPath));
            for (String line : allLines) {
//                for (Character symbol : line.toCharArray()) {
//                    symbol = Character.toUpperCase(symbol);
//                    writer.print(symbol);
//                }
                line = line.toUpperCase();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException exception) {
            throw new IOException(exception);
        }

    }
}
