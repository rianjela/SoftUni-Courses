package L01_BasicSyntax;

import java.util.Scanner;

public class L09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i < 2 * n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
            }
        }
            System.out.printf("Sum: %d", sum);
    }
}
