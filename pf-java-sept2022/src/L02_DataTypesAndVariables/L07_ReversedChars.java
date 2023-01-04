package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        String combinedChar = String.format("%c %c %c", thirdChar, secondChar, firstChar);
        System.out.println(combinedChar);
    }
}
