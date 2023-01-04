package L04_Methods;

import java.util.Scanner;

public class L05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String orderType = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (orderType) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;

        }
        orderPrice(quantity, price);
    }

    public static void orderPrice(int a, double b) {
        System.out.printf("%.2f", a * b);
    }
}