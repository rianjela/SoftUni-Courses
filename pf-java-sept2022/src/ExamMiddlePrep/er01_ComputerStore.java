package ExamMiddlePrep;

import java.util.Scanner;

public class er01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumPrice = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double priceCurrent = Double.parseDouble(input);

            if (priceCurrent < 0) {
                System.out.println("Invalid price!");
            } else {
                sumPrice += priceCurrent;

                if (sumPrice <= 0) {
                    System.out.println("Invalid order!");
                }
            }
            input = scanner.nextLine();
        }
        if (sumPrice == 0) {
            System.out.println("Invalid order!");
        } else {
            double taxes = sumPrice * 0.20;
            double totalPrice = 0;
            switch (input) {
                case "special":
                    totalPrice = (sumPrice + taxes) - (sumPrice + taxes) * 0.1;
                    break;
                case "regular":
                    totalPrice = sumPrice + taxes;
                    break;
            }

            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$", sumPrice, taxes, totalPrice);
        }

    }
}
