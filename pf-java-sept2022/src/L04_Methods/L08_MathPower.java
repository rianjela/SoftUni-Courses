package L04_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(mathPower(number,power)));
    }

    public static double mathPower(double n1, double pow) {
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result = result * n1;

        }
        return result;
    }
}
