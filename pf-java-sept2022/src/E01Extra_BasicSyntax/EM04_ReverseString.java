package E01Extra_BasicSyntax;

import java.util.Scanner;

public class EM04_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverse = "";

        for (int i = (input.length() - 1); i >= 0; i--) {
            char lastLetter = input.charAt(i);
            reverse = reverse + lastLetter;
        }

        System.out.print(reverse);
    }
}
