package E08_TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> usernameList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        for (String user : usernameList) {
            if (isLengthValid(user) && isValidText(user)) {
                System.out.printf("%s%n", user);
            }
        }
    }

    private static boolean isLengthValid(String input) {
        return input.length() >= 3 && input.length() <= 16;
    }

    private static boolean isValidText(String input) {

        for (char letter : input.toCharArray()) {
            if (!Character.isLetterOrDigit(letter) && letter != '-' && letter != '_') {
                return false;
            }
        }
        return true;
    }

}
