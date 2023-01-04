package e02_ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget*10/100;

        if(extras>150) {
            pricePerCostume = pricePerCostume - pricePerCostume*10/100;
                    }

        double expenses = extras*pricePerCostume + decorPrice;

        double spareMoney = budget - expenses;

        if(spareMoney>=0){
            System.out.printf("Action!%nWingard starts filming with %.02f leva left.", spareMoney);

        } else {
            System.out.printf(	"Not enough money!%nWingard needs %.02f leva more.", Math.abs(spareMoney));
        }



    }
}
