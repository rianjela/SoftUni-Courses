package E04_StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E05_LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = "\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(path + inputPath));


        PrintWriter writer = new PrintWriter(new File(path + "\\outputLineNumbers.txt"));
        int lineNumber = 1;
        for (String line : allLines) {
            writer.println(lineNumber + ". " + line);
            lineNumber++;
        }

        writer.close();
    }
}
