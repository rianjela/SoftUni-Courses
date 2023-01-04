package E08_TextProcessing;

import java.util.Scanner;

public class E03_ExtractFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] path = input.split("\\\\");
        String fileData = path[path.length - 1];

        String fileName = fileData.split("\\.")[0];
        String extension = fileData.split("\\.")[1];

        System.out.printf("File name: %s\nFile extension: %s", fileName, extension);
    }
}
