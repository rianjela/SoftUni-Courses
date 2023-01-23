package L04_StreamsFilesAndDirectories;

import java.io.*;

public class L03_CopyBytes {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_L03.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();

            while (readByte >= 0) {
                //FIXME
                if (readByte == 10 || readByte == 32) {


                } else {

                }

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
