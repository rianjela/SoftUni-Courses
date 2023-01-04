package L04_Methods;

import java.util.Scanner;

public class L01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        positiveOrNegative(n);

    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }

}
