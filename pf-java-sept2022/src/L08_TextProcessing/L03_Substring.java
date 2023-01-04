package L08_TextProcessing;

import java.util.Scanner;

public class L03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String inputToUpdate = scanner.nextLine();

        int indexToRemove = inputToUpdate.indexOf(wordToRemove);

        while (indexToRemove != -1) {
            inputToUpdate = inputToUpdate.replace(wordToRemove, "");
            indexToRemove = inputToUpdate.indexOf(wordToRemove);
        }

        System.out.println(inputToUpdate);

    }
}
