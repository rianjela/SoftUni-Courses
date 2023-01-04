package exam_April2019;

import java.util.Scanner;

public class E03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;

        switch (dates) {
            case "21-23":
                if (destination.equals("France")) {
                    pricePerNight = 30;
                } else if (destination.equals("Italy")) {
                    pricePerNight = 28;
                } else if (destination.equals("Germany")) {
                    pricePerNight = 32;
                }
                break;
            case "24-27":
                if (destination.equals("France")) {
                    pricePerNight = 35;
                } else if (destination.equals("Italy")) {
                    pricePerNight = 32;
                } else if (destination.equals("Germany")) {
                    pricePerNight = 37;
                }
                break;
            case "28-31":
                if (destination.equals("France")) {
                    pricePerNight = 40;
                } else if (destination.equals("Italy")) {
                    pricePerNight = 39;
                } else if (destination.equals("Germany")) {
                    pricePerNight = 43;
                }
                break;
        }

        System.out.printf("Easter trip to %s : %.2f leva.", destination, pricePerNight * nights);

    }
}
