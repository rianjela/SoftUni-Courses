package exam_April2019;

import java.util.Scanner;

public class E02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        double pricePerGuest = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());


        if (guestsCount > 20) {
            pricePerGuest -= pricePerGuest * 25 / 100;
        } else if (guestsCount > 15) {
            pricePerGuest -= pricePerGuest * 20 / 100;
        } else if (guestsCount >= 10) {
            pricePerGuest -= pricePerGuest * 15 / 100;
        }

        double cakePrice = budget * 10 / 100;
        double priceDifference = budget - guestsCount * pricePerGuest - cakePrice;

        if (priceDifference>=0){
            System.out.printf("It is party time! %.2f leva left.", priceDifference);
        } else {
            System.out.printf("No party! %.2f leva needed.", Math.abs(priceDifference));
        }
    }
}
