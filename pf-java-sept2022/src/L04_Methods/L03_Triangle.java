package L04_Methods;

import java.util.Scanner;

public class L03_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        triangleOfNumbers(n);

    }

    public static void triangleOfNumbers(int number) {
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        reversedTriangeOfNumbers(number);
    }


    public static void reversedTriangeOfNumbers(int number) {

        for (int i = number; i >= 1; i--) {

            for (int j = 1; j <= i - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
