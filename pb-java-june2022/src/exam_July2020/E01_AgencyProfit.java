package exam_July2020;

import java.util.Scanner;

public class E01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameCompany = scanner.nextLine();
        int ticketsAdultsCount = Integer.parseInt(scanner.nextLine());
        int ticketsKidsCount = Integer.parseInt(scanner.nextLine());
        double ticketAdultsPrice = Double.parseDouble(scanner.nextLine());
        double taxesPrice = Double.parseDouble(scanner.nextLine());

        double ticketsKidsPrice = ticketAdultsPrice * 30 / 100;
        ticketAdultsPrice += taxesPrice;
        ticketsKidsPrice += taxesPrice;

        double priceTotal = ticketsAdultsCount * ticketAdultsPrice + ticketsKidsCount * ticketsKidsPrice;
        double profit = priceTotal*20/100;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", nameCompany, profit);

    }
}
