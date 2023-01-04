package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 British Pound = 1.36 Dollars

        double britishPound = Double.parseDouble(scanner.nextLine());
        double dollars = britishPound * 1.36;

        System.out.printf("%.3f", dollars);
    }
}
