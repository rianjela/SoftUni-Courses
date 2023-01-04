package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E05_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = "";
        String accommodation = "";
        double price = 0;

        switch (season) {
            case "summer":
                accommodation = "Camp";
                break;
            case "winter":
                accommodation = "Hotel";
                break;
        }

        if (budget <= 100) {
            place = "Somewhere in Bulgaria";
            switch (season) {
                case "summer":
                    price = budget * 0.3;
                    break;

                case "winter":
                    price = budget * 0.7;
                    break;
            }

        } else if (budget <= 1000) {
            place = "Somewhere in Balkans";
            switch (season) {
                case "summer":
                    price = budget * 0.4;
                    break;

                case "winter":
                    price = budget * 0.8;
                    break;
            }

        } else {
            place = "Somewhere in Europe";
            accommodation = "Hotel";
            price = budget * 0.9;

        }

        System.out.printf("%s%n%s - %.2f", place,accommodation,price);
    }
}
