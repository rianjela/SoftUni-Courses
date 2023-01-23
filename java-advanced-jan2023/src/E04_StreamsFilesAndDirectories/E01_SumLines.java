package E04_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class E01_SumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\User\\Desktop\\softuni\\java-advanced-2023\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

//        for (String line : allLines) {
//            int sum = 0;
//            for (char symbol : line.toCharArray()) {
//                sum += (int) symbol;
//            }
//            System.out.println(sum);
//        }

        allLines.stream()
                .map(line -> line.toCharArray())
                .forEach(arr -> {
                            int sum = 0;
                            for (char symbol : arr) {
                                sum += (int) symbol;
                            }
                            System.out.println(sum);
                        }
                );

    }
}
