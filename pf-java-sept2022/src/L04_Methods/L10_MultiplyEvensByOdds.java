package L04_Methods;

import java.util.Scanner;

public class L10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
       System.out.println(multiplyEvenByOddsSums(number));
       //multiplyEvenByOddsSums(number);

    }

    public static int multiplyEvenByOddsSums(int number) {
        int evenSum = 0;
        int oddSum = 0;

        while (number != 0) {

            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }

            number = number / 10;
        }
        return evenSum * oddSum;
    }
}

