package exam_July2020;

import java.util.Scanner;

public class E02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double over20kgPrice = Double.parseDouble(scanner.nextLine());
        double luggageKg = Double.parseDouble(scanner.nextLine());
        int daysTillFlight = Integer.parseInt(scanner.nextLine());
        int luggageCount = Integer.parseInt(scanner.nextLine());
        double luggagePrice = 0;

        if (luggageKg < 10) {
            luggagePrice = over20kgPrice * 20 / 100;
        } else if (luggageKg <= 20) {
            luggagePrice = over20kgPrice * 50 / 100;
        } else {
            luggagePrice = over20kgPrice;
        }


        if (daysTillFlight < 7) {
            luggagePrice += luggagePrice * 40 / 100;
        } else if (daysTillFlight <= 30) {
            luggagePrice += luggagePrice * 15 / 100;
        } else {
            luggagePrice += luggagePrice * 10 / 100;
        }

        System.out.printf("The total price of bags is: %.2f lv.", luggagePrice * luggageCount);
    }
}
