package E01_BasicSyntax;

import java.util.Scanner;

public class E09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double pricePerCapsule = 0;
        int days = 0;
        int capsulesCount = 0;
        double pricePerCoffee = 0;
        double totalPrice = 0;

        for (int i = 1; i <= ordersCount; i++) {

            pricePerCapsule = Double.parseDouble(scanner.nextLine());
            days = Integer.parseInt(scanner.nextLine());
            capsulesCount = Integer.parseInt(scanner.nextLine());

            pricePerCoffee = days * capsulesCount * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f\n", pricePerCoffee);
            totalPrice += pricePerCoffee;

        }

        System.out.printf("Total: $%.2f", totalPrice);

    }
}
