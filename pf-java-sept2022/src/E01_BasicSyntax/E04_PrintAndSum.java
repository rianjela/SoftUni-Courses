package E01_BasicSyntax;

import java.util.Scanner;

public class E04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sum: 45

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = n1; i <= n2 ; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("\nSum: %d", sum);
    }
}
