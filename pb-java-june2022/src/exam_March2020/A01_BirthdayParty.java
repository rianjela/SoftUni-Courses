package exam_March2020;

import java.util.Scanner;

public class A01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rent = Double.parseDouble(scanner.nextLine());

        double cakePrice = rent * 20 / 100;
        double drinksPrice = cakePrice - cakePrice * 45 / 100;
        double animatorPrice = rent / 3;

        double budget = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.printf("%.1f", budget);

    }
}
