package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();
        double pricePerNight = 0;
        int nights = days-1;


        switch (roomType){
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":
                pricePerNight = 25;

                if (nights<10){
                    pricePerNight = pricePerNight - pricePerNight*0.3;
                }else if (nights<=15) {
                    pricePerNight = pricePerNight - pricePerNight*0.35;
                }else {
                    pricePerNight = pricePerNight - pricePerNight*0.5;
                }
                break;

            case"president apartment":
                pricePerNight = 35;

                if (nights<10){
                    pricePerNight = pricePerNight - pricePerNight*0.1;
                }else if (nights<=15) {
                    pricePerNight = pricePerNight - pricePerNight*0.15;
                }else {
                    pricePerNight = pricePerNight - pricePerNight*0.2;
                }
                break;
        }
                double priceTotal = pricePerNight*nights;

            switch (review){

                case "positive":
                    priceTotal = priceTotal + priceTotal*0.25;
                    break;

                case "negative":
                    priceTotal = priceTotal - priceTotal*0.1;
                    break;
            }

        System.out.printf("%.02f", priceTotal);
    }

}
