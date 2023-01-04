package e01_FirstStepsInCoding;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bascetballTax = Integer.parseInt(scanner.nextLine());

        double priceShoes = bascetballTax - bascetballTax*40/100.00;
        double priceClothes = priceShoes - priceShoes*20/100;
        double priceBall = priceClothes / 4;
        double priceAccessories = priceBall / 5;

        double priceTotal = priceShoes + priceClothes + priceBall +priceAccessories + bascetballTax;

        System.out.println(priceTotal);


    }
}
