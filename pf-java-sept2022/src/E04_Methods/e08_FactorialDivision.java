package E04_Methods;

import java.util.Scanner;

public class e08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        double divisionFactorials = 1.0 * factorialLong(number1) / factorialLong(number2);

        System.out.printf("%.2f", divisionFactorials);
    }

    public static long factorialLong(int n1) {
        long factorial = 1;

        for (int i = 1; i <= n1; i++) {
            factorial *= i;

        }
        return factorial;
    }

}
