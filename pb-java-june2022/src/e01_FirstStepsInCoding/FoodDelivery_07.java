package e01_FirstStepsInCoding;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuChicken = Integer.parseInt(scanner.nextLine());
        int menuFish = Integer.parseInt(scanner.nextLine());
        int menuVegetarian = Integer.parseInt(scanner.nextLine());

        double priceMenus = menuChicken * 10.35 + menuFish * 12.40 + menuVegetarian * 8.15;
        double priceTotal = priceMenus + priceMenus*20/100 +2.50;

        System.out.println(priceTotal);

    }
}
