package E08_TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length() - 1; i++) {
            char currentSymbol = input.charAt(i);
            char nextSymbol = input.charAt(i + 1);

            if (currentSymbol == nextSymbol) {
                input.deleteCharAt(i);
                i--;
            }

        }

        System.out.print(input);

    }
}
