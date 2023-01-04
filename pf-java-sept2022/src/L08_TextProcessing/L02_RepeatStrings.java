package L08_TextProcessing;

import java.util.Scanner;

public class L02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split("\\s+");
        StringBuilder newWord = new StringBuilder();

        for (String word : wordsArr) {
            int wordLength = word.length();
            for (int i = 0; i < wordLength; i++) {
                newWord.append(word);
            }
        }
        System.out.println(newWord);

    }
}