package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        int priceBoat = 0;
        double priceTotal = 0;

        switch (season){

            case "Spring":
                priceBoat = 3000;
                break;

            case "Summer":
            case "Autumn":
                priceBoat = 4200;
                break;

            case "Winter":
                priceBoat = 2600;
                break;
        }

//Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.

        if (fishermen<=6){
            priceTotal = priceBoat - priceBoat*0.1;
        }else if (7<=fishermen && fishermen<=11) {
            priceTotal = priceBoat - priceBoat*0.15;
        }else {
            priceTotal = priceBoat - priceBoat*0.25;
        }

        if(fishermen%2==0 && !season.equals("Autumn")) {
            priceTotal = priceTotal - priceTotal*0.05; }

        if (budget>=priceTotal) {
            System.out.printf("Yes! You have %.2f leva left.", budget-priceTotal);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget-priceTotal));
        }

    }
}
