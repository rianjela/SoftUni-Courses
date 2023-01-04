package E04_Methods;

import java.util.Scanner;

public class e06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        printMiddleLetters(textInput);
    }

    public static void printMiddleLetters(String input) {

        if (input.length() % 2 != 0) {
            System.out.println(input.charAt(input.length() / 2));
        } else {
            System.out.printf("%s%s", input.charAt(input.length() / 2 - 1), input.charAt(input.length() / 2));
        }
    }

}
