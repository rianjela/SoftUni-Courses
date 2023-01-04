package L08_TextProcessing;

import java.util.Scanner;

public class L04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(",\\s+");
        String textToUpdate = scanner.nextLine();

        for (String word : bannedWords) {
            int indexToReplace = textToUpdate.indexOf(word);

            while (indexToReplace != -1) {
                textToUpdate = textToUpdate.replaceAll(word, replaceWordWithSym(word));
                indexToReplace = textToUpdate.indexOf(word);
            }

        }

        System.out.println(textToUpdate);
    }

    private static String replaceWordWithSym(String word) {
        StringBuilder replacement = new StringBuilder();

        for (char charElement : word.toCharArray()) {
            replacement.append("*");
        }

        return replacement.toString();
    }

}

