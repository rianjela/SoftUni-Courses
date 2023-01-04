package E04_Methods;

import java.util.Scanner;

public class e10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            if (sumOfDigitsDivisibleBy8(i) && containsOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean sumOfDigitsDivisibleBy8(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n = n / 10;
        }

        return sumOfDigits % 8 == 0;
    }

    public static boolean containsOddDigit(int n) {
        boolean oddNumber = false;

        while (n > 0) {
            if (n % 2 != 0) {
                oddNumber = true;
                break;
            }
            n = n / 10;
        }

        return oddNumber;
    }


}
