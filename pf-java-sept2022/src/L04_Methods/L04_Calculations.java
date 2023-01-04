package L04_Methods;

import java.util.Scanner;

public class L04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        switch (action) {
            case "add":
                mathAdd(n1, n2);
                break;
            case "multiply":
                mathMultiply(n1, n2);
                break;
            case "subtract":
                mathStubtract(n1, n2);
                break;
            case "divide":
                mathDivide(n1, n2);
                break;

        }

    }

    public static void mathAdd(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void mathMultiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public static void mathStubtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    public static void mathDivide(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
