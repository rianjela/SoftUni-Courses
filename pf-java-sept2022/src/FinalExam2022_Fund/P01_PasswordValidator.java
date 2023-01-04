package FinalExam2022_Fund;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String password = scanner.nextLine();
        StringBuilder password = new StringBuilder(scanner.nextLine());

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Complete")) {
            String action = command[0];
            switch (action) {
                case "Make":
                    String upperOrLower = command[1];
                    int changeCaseIndex = Integer.parseInt(command[2]);
                    String symbolAtIndex = password.charAt(changeCaseIndex) + "";

                    if (upperOrLower.equals("Upper")) {
                        password.replace(changeCaseIndex, changeCaseIndex + 1, symbolAtIndex.toUpperCase());
                    } else if (upperOrLower.equals("Lower")) {
                        password.replace(changeCaseIndex, changeCaseIndex + 1, symbolAtIndex.toLowerCase());
                    }
                    System.out.println(password);
                    break;
                case "Insert":
                    int insertIndex = Integer.parseInt(command[1]);
                    String insertChar = command[2];
                    if (insertIndex >= 0 && insertIndex < password.length()) {
                        password.insert(insertIndex, insertChar);
                    }
                    System.out.println(password);
                    break;
                case "Replace":
                    char replaceChar = command[1].charAt(0);
                    int valueToAdd = Integer.parseInt(command[2]);
                    char newCharValue = (char) (replaceChar + valueToAdd);
                    String charToString = replaceChar + "";
                    String newCharToString = newCharValue + "";

                    if (charToString.equals("*")) {
                        charToString = "\\*";
//                    charToString = removeFirstAndLast(charToString);
//                    newCharToString = removeFirstAndLast(newCharToString);
                    }

                    password = new StringBuilder(password.toString().replaceAll(charToString, newCharToString));

                    System.out.println(password);
                    break;
                case "Validation":
                    if (!isAtLeast8CharsLong(password)) {
                        System.out.println("Password must be at least 8 characters long!");
                    }

                    if (!isValidSymbols(password)) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }

                    if (!hasOneUpperCase(password)) {
                        System.out.println("Password must consist at least one uppercase letter!");
                    }

                    if (!hasOneLowerCase(password)) {
                        System.out.println("Password must consist at least one lowercase letter!");
                    }

                    if (!hasOneDigit(password)) {
                        System.out.println("Password must consist at least one digit!");
                    }

                    break;

            }


            command = scanner.nextLine().split("\\s+");
        }
    }

    private static String removeFirstAndLast(String text) {
        StringBuilder textsb = new StringBuilder();
        for (int i = 1; i < text.length() - 1; i++) {

            textsb.append(text.charAt(i));

        }
        return textsb.toString();
    }

    private static boolean hasOneDigit(StringBuilder text) {
        boolean isDigit = false;
        for (char symbol : text.toString().toCharArray()) {
            if (Character.isDigit(symbol)) {
                isDigit = true;
                break;
            }
        }

        return isDigit;
    }

    private static boolean hasOneLowerCase(StringBuilder text) {
        boolean isLowerCase = false;
        for (char symbol : text.toString().toCharArray()) {
            if (Character.isLowerCase(symbol)) {
                isLowerCase = true;
                break;
            }
        }

        return isLowerCase;
    }

    private static boolean hasOneUpperCase(StringBuilder text) {
        boolean isUpperCase = false;
        for (char symbol : text.toString().toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                isUpperCase = true;
                break;
            }
        }

        return isUpperCase;
    }

    private static boolean isValidSymbols(StringBuilder text) {
        boolean isValid = true;
        for (char character : text.toString().toCharArray()) {
            if (!Character.isLetterOrDigit(character) && character != '_') {
                isValid = false;
            }
        }
        return isValid;
    }

    private static boolean isAtLeast8CharsLong(StringBuilder text) {
        return text.length() >= 8;
    }
}
