package E01_BasicSyntax;

import java.util.Scanner;

public class E07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0;

        while (!input.equals("Start")) {
            double insertedCoin = Double.parseDouble(input);

            if (insertedCoin == 0.1 || insertedCoin == 0.2 || insertedCoin == 0.5 || insertedCoin == 1 || insertedCoin == 2) {
                sumCoins += insertedCoin;
            } else {
                System.out.printf("Cannot accept %.2f\n", insertedCoin);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        double price = 0;


        while (!input.equals("End")) {


            switch (input) {
                case "Nuts":
                    price = 2;
                    if (price <= sumCoins) {
                        System.out.println("Purchased Nuts");
                        sumCoins -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Water":
                    price = 0.7;
                    if (price <= sumCoins) {
                        System.out.println("Purchased Water");
                        sumCoins -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Crisps":
                    price = 1.5;
                    if (price <= sumCoins) {
                        System.out.println("Purchased Crisps");
                        sumCoins -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Soda":
                    price = 0.8;
                    if (price <= sumCoins) {
                        System.out.println("Purchased Soda");
                        sumCoins -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                case "Coke":
                    price = 1;
                    if (price <= sumCoins) {
                        System.out.println("Purchased Coke");
                        sumCoins -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sumCoins);
    }
}

