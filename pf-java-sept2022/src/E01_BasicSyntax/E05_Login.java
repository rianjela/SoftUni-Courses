package E01_BasicSyntax;

import java.util.Scanner;

public class E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String username = scanner.nextLine();
        String password = "";
        int tryCounter = 0;

        for (int i = username.length() - 1; i >= 0; i--) {
            char lastLetter = username.charAt(i);
            password = password + lastLetter;
        }

        String input = scanner.nextLine();

        while (!input.equals(password)) {
            tryCounter++;

            if (tryCounter <= 3) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s blocked!", username);
                break;
            }
            input = scanner.nextLine();
        }

        if (tryCounter <= 3) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
