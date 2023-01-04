package e02_ConditionalStatements;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCards*250;
        double cpuPrice = cpu * videoCardPrice*35/100;
        double ramPrice = ram*videoCardPrice*10/100;

        double totalPrice = videoCardPrice+cpuPrice+ramPrice;

        if (videoCards>cpu) {
            totalPrice = totalPrice - totalPrice*15/100;
        }

        double priceDifference = budget-totalPrice;

        if(budget>=totalPrice){
            System.out.printf("You have %.02f leva left!", priceDifference);
        } else {
            System.out.printf("Not enough money! You need %.02f leva more!", Math.abs(priceDifference));
        }

    }
}
