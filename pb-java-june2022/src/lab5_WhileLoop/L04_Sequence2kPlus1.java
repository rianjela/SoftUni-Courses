package lab5_WhileLoop;

import java.util.Scanner;

public class L04_Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int m = 1;

        while (m <= n) {
            System.out.printf("%d\n", m);
            m = m * 2 + 1;
        }
    }
}
