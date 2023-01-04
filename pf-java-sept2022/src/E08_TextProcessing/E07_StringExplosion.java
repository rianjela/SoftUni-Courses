package E08_TextProcessing;

import java.util.Scanner;

public class E07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        int indexOfPower = input.indexOf(">");
        int power = 0;

        for (int i = indexOfPower + 1; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (currentChar != '>' && Character.isDigit(currentChar)) {
                power += Integer.parseInt(input.charAt(i) + "");
            }

            if (power > 0 && Character.isLetterOrDigit(currentChar)) {
                input.deleteCharAt(i);
                power--;
                i--;
            }

        }

        System.out.println(input);

    }
}
