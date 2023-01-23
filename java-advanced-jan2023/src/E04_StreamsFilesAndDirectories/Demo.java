package E04_StreamsFilesAndDirectories;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources";
        String inputPath = "\\input.txt";
        String outputPath = "\\output_demo.txt";
        String outputBuffered = "\\output_demo_buffered.txt";

        //FileWriter
        File file = new File(path + outputPath);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Demo");
        fileWriter.close();

        //BufferedWriter -> по-бърз
        File fileForBuffered = new File(path + outputBuffered); //File --> new file with path
        FileWriter fileWriterBf = new FileWriter(fileForBuffered); //FileWriter --> from File
        BufferedWriter bfWriter = new BufferedWriter(fileWriterBf); //BufferedWriter --> from FileWriter
        bfWriter.write("Demo buff");
        bfWriter.close();


    }
}
