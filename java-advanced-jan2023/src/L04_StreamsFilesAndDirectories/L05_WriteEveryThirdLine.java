package L04_StreamsFilesAndDirectories;

import java.io.*;

public class L05_WriteEveryThirdLine {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_L05.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {
            int lineCount = 1;
            String line = reader.readLine();

            while (line != null) {
                if (lineCount % 3 == 0) {
                    writer.println(line);
                }
                line = reader.readLine();
                lineCount++;
            }


        } catch (IOException e) {
            throw new RuntimeException();
        }


    }
}
