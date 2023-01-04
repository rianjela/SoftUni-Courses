package e02_ConditionalStatements;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceTravel = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());

        int allToysCount = puzzleCount+dollsCount+bearsCount+minionsCount+trucksCount;
        double priceToys = puzzleCount*2.60 + dollsCount*3 +bearsCount*4.10 + minionsCount*8.20 + trucksCount*2;

        if(allToysCount>=50){
            priceToys = priceToys - (priceToys*25/100);
                    }

        double priceRent = priceToys*10/100;
        double moneyToUse = priceToys-priceRent;
        double moneyLeft = moneyToUse-priceTravel;

        if (priceTravel<= moneyToUse){
            System.out.printf("Yes! %.02f lv left.", moneyLeft);
        } else{
            System.out.printf("Not enough money! %.02f lv needed.", Math.abs(moneyLeft));
        }

    }
}
