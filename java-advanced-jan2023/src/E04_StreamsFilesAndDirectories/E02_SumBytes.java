package E04_StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E02_SumBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            List<String> lines = Files.readAllLines(Path.of(path));
//
//            long sum = 0;
//            for (String line : lines) {
//                for (char symbol : line.toCharArray()) {
//                    sum += (int) symbol;
//                }
//            }
//            System.out.println(sum);
//
//        } catch (IOException e) {
//            throw new IOException();
//        }


        byte[] allBytes = Files.readAllBytes(Path.of(path));
        long sum = 0;
        for (byte symbol : allBytes) {
            if (symbol != 10 && symbol != 13) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }
}
