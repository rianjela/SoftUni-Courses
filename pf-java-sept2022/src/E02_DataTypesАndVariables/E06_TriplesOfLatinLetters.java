package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 97; i < 97 + number; i++) {

            for (int j = 97; j < 97 + number; j++) {

                for (int k = 97; k < 97 + number; k++) {

                    System.out.println("" + (char) i + (char) j + (char) k);
                }

            }

        }
    }
}
