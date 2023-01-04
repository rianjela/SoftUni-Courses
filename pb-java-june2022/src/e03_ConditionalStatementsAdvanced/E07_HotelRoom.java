package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceTotalStudio = 0;
        double priceTotalApartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;


        switch (month) {
            case "May":
            case "October":
                priceStudio = 50;
                priceApartment = 65;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudio - priceStudio * 0.05;

                } else if (nights > 14) {
                    priceStudio = priceStudio - priceStudio * 0.3;
                }
                break;

            case "June":
            case "September":
                priceStudio = 75.2;
                priceApartment = 68.7;

                if (nights > 14) {
                    priceStudio = priceStudio - priceStudio * 0.2;
                }
                break;

            case "July":
            case "August":
                priceStudio = 76;
                priceApartment = 77;
                break;

        }

        if (nights > 14) {
            priceApartment = priceApartment - priceApartment * 0.1;
        }

        priceTotalApartment = priceApartment * nights;
        priceTotalStudio = priceStudio * nights;

        System.out.printf("Apartment: %.2f lv.\nStudio: %.2f lv.", priceTotalApartment, priceTotalStudio);

    }

}
