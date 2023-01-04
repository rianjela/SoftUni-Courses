package lab5_WhileLoop;

import java.util.Scanner;

public class L05_AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("NoMoreMoney")) {
            double inputNum = Double.parseDouble(input);

            if (inputNum < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f\n", inputNum);
            sum += inputNum;
            input = scanner.nextLine();
        }

        System.out.printf("Total: %.2f", sum);
    }
}
