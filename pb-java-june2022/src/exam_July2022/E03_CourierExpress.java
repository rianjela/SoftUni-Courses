package exam_July2022;

import java.util.Scanner;

public class E03_CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightPackageKg = Double.parseDouble(scanner.nextLine());
        String serviceType = scanner.nextLine();
        int distanceKm = Integer.parseInt(scanner.nextLine());

        double stPerKm = 0;
        double stExpress = 0;
        double priceTotal = 0;
        boolean express = false;


        switch (serviceType) {
            case "standard":
                if (weightPackageKg < 1) {
                    stPerKm = 3;
                } else if (weightPackageKg < 10) {
                    stPerKm = 5;
                } else if (weightPackageKg < 40) {
                    stPerKm = 10;
                } else if (weightPackageKg < 90) {
                    stPerKm = 15;
                } else if (weightPackageKg < 150) {
                    stPerKm = 20;

                }
                break;


            case "express":
                if (weightPackageKg < 1) {
                    stPerKm = 3;
                    stExpress = weightPackageKg * 3 * 0.8;
                } else if (weightPackageKg < 10) {
                    stPerKm = 5;
                    stExpress = weightPackageKg * 5 * 0.4;
                } else if (weightPackageKg < 40) {
                    stPerKm = 10;
                    stExpress = weightPackageKg * 10 * 0.05;
                } else if (weightPackageKg < 90) {
                    stPerKm = 15;
                    stExpress = weightPackageKg * 15 * 0.02;
                } else if (weightPackageKg < 150) {
                    stPerKm = 20;
                    stExpress = weightPackageKg * 20 * 0.01;
                }
                express = true;

                break;
        }

        if (express) {
            priceTotal = distanceKm * stPerKm + distanceKm * stExpress;
        } else {
            priceTotal = distanceKm * stPerKm;
        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weightPackageKg, priceTotal / 100);

    }
}
