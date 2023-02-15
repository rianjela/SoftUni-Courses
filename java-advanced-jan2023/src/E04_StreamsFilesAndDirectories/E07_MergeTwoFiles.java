package E04_StreamsFilesAndDirectories;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {

    String pathOne = "D:\\SoftUni\\Study-Materials\\Java-Advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
    String pathTwo = "D:\\SoftUni\\Study-Materials\\Java-Advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

    PrintWriter writer = new PrintWriter("outputMerge.txt");

        List<String> allLinesFileOne = Files.readAllLines(Path.of(pathOne)); //всички редове от файл 1
        allLinesFileOne.forEach(line -> writer.println(line));
        List<String> allLinesFileTwo = Files.readAllLines(Path.of(pathTwo)); //всички редове от файл 2
        allLinesFileTwo.forEach(line -> writer.println(line));

        writer.close();
    }

}
