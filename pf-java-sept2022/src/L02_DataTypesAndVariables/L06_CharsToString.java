package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char char1 = scanner.nextLine().charAt(0);
        char char2 = scanner.nextLine().charAt(0);
        char char3 = scanner.nextLine().charAt(0);

        String combineChars = "" + char1 + char2 + char3;

        System.out.println(combineChars);
    }
}
