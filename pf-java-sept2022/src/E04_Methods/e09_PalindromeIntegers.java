package E04_Methods;

import java.util.Scanner;

public class e09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {

            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String number) {

        boolean mirroredNumbers = false;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == number.charAt(number.length() - 1 - i)) {
                mirroredNumbers = true;
            } else {
                mirroredNumbers = false;
                break;
            }
        }

        return mirroredNumbers;

    }

}
