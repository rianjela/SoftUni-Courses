package lab2_ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        String passwordCheck = "s3cr3t!P@ssw0rd";

        if (pass.equals(passwordCheck)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}