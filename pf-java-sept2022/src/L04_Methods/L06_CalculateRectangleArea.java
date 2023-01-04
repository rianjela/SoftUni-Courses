package L04_Methods;

import java.util.Scanner;

public class L06_CalculateRectangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        double area = rectangleArea(width, length);
        System.out.printf("%.0f", area);
    }

    public static double rectangleArea(int a, int b) {
        return a * b;
    }
}
