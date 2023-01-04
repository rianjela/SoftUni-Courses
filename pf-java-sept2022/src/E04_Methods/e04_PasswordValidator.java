package E04_Methods;

import java.util.Scanner;

public class e04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (isPassLongEnough(password)&&areSpecialNumbersInPass(password)&&doesContainTwoDigits(password)){
            System.out.println("Password is valid");
        } else {
        if (!isPassLongEnough(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!areSpecialNumbersInPass(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!doesContainTwoDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        }

    }

    public static boolean isPassLongEnough(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    //48:57 / 65:90 / 97:122
    public static boolean areSpecialNumbersInPass(String pass) {
        boolean containsSpecialChar = false;

        for (int i = 0; i < pass.length(); i++) {
            char currentSymbol = pass.charAt(i);

            if (currentSymbol < 48 || (currentSymbol > 57 && currentSymbol < 65) || (currentSymbol > 90 && currentSymbol < 97) || currentSymbol > 122) {
                containsSpecialChar = true;
                break;
            }
        }

        return !containsSpecialChar;
    }


    public static boolean doesContainTwoDigits(String pass) {
        int counterDigits = 0;

        for (int i = 0; i < pass.length(); i++) {
            char currentSymbol = pass.charAt(i);

            if (currentSymbol >= 48 && currentSymbol <= 57) {
                counterDigits++;
            }
        }

        return counterDigits >= 2;
    }
}
