package L03_StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class L04_ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_L04.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));


        while (reader.hasNext()){
        if (reader.hasNextInt()){
            writer.println(reader.nextInt());
        }
        reader.next();
        }

    }
}
