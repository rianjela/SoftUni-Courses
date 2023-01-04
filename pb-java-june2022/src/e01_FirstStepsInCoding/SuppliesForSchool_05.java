package e01_FirstStepsInCoding;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double price = pens * 5.80 + markers * 7.20 + cleaner * 1.20;
        double priceFinal = price - (price*discountPercent/100);

        System.out.println(priceFinal);

    }
}
