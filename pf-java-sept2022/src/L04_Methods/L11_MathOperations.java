package L04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = Double.parseDouble(scanner.nextLine());;
        char symbol = scanner.nextLine().charAt(0);
        double n2 = Double.parseDouble(scanner.nextLine());;

        System.out.print(new DecimalFormat("0.##").format(mathOperations(n1, symbol, n2)));
    }

    public static double mathOperations(double number1, char operator, double number2) {
        double result = 0;
        switch (operator) {
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
        }

        return result;
    }
}
