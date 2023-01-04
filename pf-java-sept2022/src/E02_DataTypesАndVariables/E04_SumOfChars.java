package E02_DataTypesАndVariables;

import java.util.Scanner;

public class E04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfChars = Integer.parseInt(scanner.nextLine());
        int sumOfChars = 0;

        for (int i = 1; i <= numberOfChars ; i++) {

            char input = scanner.nextLine().charAt(0);
            sumOfChars += (int) input;

        }

        System.out.printf("The sum equals: %d", sumOfChars);
    }
}
