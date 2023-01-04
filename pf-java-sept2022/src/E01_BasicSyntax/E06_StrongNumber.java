package E01_BasicSyntax;

import java.util.Scanner;

public class E06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1! + 4! + 5! = 145.

        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int lastDigit = 0;

        int sum = 0;

        while (number != 0) {
            int multiplication = 1;
            lastDigit = number % 10;

            for (int i = 1; i <= lastDigit; i++) {
                multiplication = multiplication * i;
            }

            sum += multiplication;
            number = number / 10;
        }

        if (sum == initialNumber){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
