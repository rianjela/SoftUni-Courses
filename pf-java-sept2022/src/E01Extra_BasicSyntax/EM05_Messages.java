package E01Extra_BasicSyntax;

import java.util.Scanner;

public class EM05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        String message = "";

        for (int i = 0; i < n; i++) {

            int keyInput = Integer.parseInt(scanner.nextLine());
            String keyInputString = "" + keyInput;

            int mainDigit = keyInput % 10;

            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }

            int letterIndex = offset + keyInputString.length() - 1;

            if (keyInput == 0) {
                message += " ";
            } else {
                message += String.valueOf(Character.toChars(letterIndex + 97));
            }
        }

        System.out.println(message);
    }
}



