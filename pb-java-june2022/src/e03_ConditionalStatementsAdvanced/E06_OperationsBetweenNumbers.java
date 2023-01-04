package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String action = scanner.nextLine();
        double math = 0;

        if (n2 == 0) {
            System.out.printf("Cannot divide %d by zero", n1);
        } else {
        switch (action) {
            case "+":
                math = n1 + n2;
                break;

            case "-":
                math = n1 - n2;
                break;

            case "*":
                math = n1 * n2;
                break;

            case "/":
                if (n2 != 0) {
                    math = 1.0 * n1 / n2;
                }
                break;

            case "%":
                math = n1 % n2;
                break;
        }


        String evenOrOdd = "";

        if (math % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }


        if (action.equals("+") || action.equals("-") || action.equals("*")) {
                System.out.printf("%d %s %d = %.0f - %s", n1, action, n2, math, evenOrOdd);
            } else if (action.equals("/")) {
                {
                    System.out.printf("%d / %d = %.2f", n1, n2, math);
                }
            } else if (action.equals("%")) {
                System.out.printf("%d %s %d = %.0f", n1, action, n2, math);
            }


        }

    }
}

