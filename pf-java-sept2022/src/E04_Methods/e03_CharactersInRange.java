package E04_Methods;

import java.util.Scanner;

public class e03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        printCharsInterval(char1, char2);

    }

    public static void printCharsInterval(char firstChar, char secondChar) {
        if (firstChar >= secondChar) {
            for (int i = secondChar + 1; i < firstChar; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = firstChar + 1; i < secondChar; i++) {
                System.out.print((char) i + " ");
            }

        }


    }

}
