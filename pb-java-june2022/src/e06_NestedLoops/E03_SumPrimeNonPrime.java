package e06_NestedLoops;

import java.util.Scanner;

public class E03_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int primeSum = 0;
        int nonPrimeSum = 0;
        int divisionCounter = 0;

        boolean nonPrime = false;

        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            n = Integer.parseInt(input);
            int tempN = n;

            if (n < 0) {

                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= n; i++) {

                if (n % i == 0) {
                    divisionCounter++;
                    if (divisionCounter == 3) {
                        nonPrime = true;
                        break;
                    }
                }
            }
                if (nonPrime) {
                    nonPrimeSum += tempN;
                } else {
                    primeSum += tempN;
                }

            divisionCounter = 0;
            nonPrime = false;
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\nSum of all non prime numbers is: %d", primeSum, nonPrimeSum);

    }
}
