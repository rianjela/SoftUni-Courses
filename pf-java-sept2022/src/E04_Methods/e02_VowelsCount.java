package E04_Methods;

import java.util.Locale;
import java.util.Scanner;

public class e02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        vowelsCountPrint(input);

    }

    public static void vowelsCountPrint(String text) {
        String textDisregardedCase = text.toLowerCase(Locale.ROOT);
        int sumVowels = 0;

        for (char current = 0; current <= text.length() - 1; current++) {
            char currentLetter = textDisregardedCase.charAt(current);
            if (currentLetter == 'a' || currentLetter == 'o' || currentLetter == 'i' || currentLetter == 'u' || currentLetter == 'e') {
                sumVowels++;
            }
        }
        System.out.println(sumVowels);
    }
}
