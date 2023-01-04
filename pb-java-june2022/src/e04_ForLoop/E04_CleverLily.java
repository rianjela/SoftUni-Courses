package e04_ForLoop;

import java.util.Scanner;

public class E04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int age = Integer.parseInt(scanner.nextLine());
        double priceLaundry = Double.parseDouble(scanner.nextLine());
        double priceOneToy = Double.parseDouble(scanner.nextLine());
        int toysCounter = 0;
        double money = 0;
        double moneyTotal = 0;


        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                money += (i / 2.0 * 10 - 1);

            } else {
                toysCounter++;
            }
        }

        moneyTotal = money + toysCounter*priceOneToy;

        if (moneyTotal>=priceLaundry){
            System.out.printf("Yes! %.02f",moneyTotal - priceLaundry);
        } else {
            System.out.printf("No! %.02f", priceLaundry-moneyTotal);
        }
    }
}
