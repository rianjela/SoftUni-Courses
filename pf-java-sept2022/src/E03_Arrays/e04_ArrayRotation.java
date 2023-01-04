package E03_Arrays;

import java.util.Scanner;

public class e04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] digitsLine = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstDigit = digitsLine[0];

            for (int j = 1; j < digitsLine.length; j++) {
                digitsLine[j - 1] = digitsLine[j];
            }
            digitsLine[digitsLine.length - 1] = firstDigit;
        }

        for (String digit : digitsLine) {

            System.out.print(digit + " ");
        }
    }
}
