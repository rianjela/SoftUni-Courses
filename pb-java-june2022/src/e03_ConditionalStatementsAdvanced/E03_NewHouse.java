package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5;
        double priceDahlias = 3.8;
        double priceTulips = 2.8;
        double priceNarcissus = 3;
        double priceGladiolus = 2.5;
        double priceTotal = 0;

        switch (flowerType) {
            case "Roses":
                if(flowerCount>80){
                    priceTotal = flowerCount*priceRoses - flowerCount*priceRoses*0.1;
                } else { priceTotal = flowerCount*priceRoses;}
                break;

            case "Dahlias":
                if(flowerCount>90){
                    priceTotal = flowerCount*priceDahlias - flowerCount*priceDahlias*0.15;
                } else { priceTotal = flowerCount*priceDahlias;}
                break;

            case "Tulips":
                if(flowerCount>80){
                    priceTotal = flowerCount*priceTulips - flowerCount*priceTulips*0.15;
                } else { priceTotal = flowerCount*priceTulips;}
                break;

            case "Narcissus":
                if(flowerCount<120){
                    priceTotal = flowerCount*priceNarcissus + flowerCount*priceNarcissus*0.15;
                } else { priceTotal = flowerCount*priceNarcissus;}
                break;

            case "Gladiolus":
                if(flowerCount<80){
                    priceTotal = flowerCount*priceGladiolus + flowerCount*priceGladiolus*0.2;
                } else { priceTotal = flowerCount*priceGladiolus;}
                break;
        }

        if(budget>=priceTotal){
            System.out.printf("Hey, you have a great garden with %s %s and %.2f leva left.", flowerCount, flowerType,budget-priceTotal);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", priceTotal-budget);
        }

    }
}
