package L08_TextProcessing;

import java.util.Scanner;

public class L05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)){
                digits.append(character);
            } else if (Character.isLetter(character)){
                letters.append(character);
            } else {
                symbols.append(character);
            }
        }

        System.out.printf("%s\n%s\n%s", digits, letters, symbols);

    }
}
