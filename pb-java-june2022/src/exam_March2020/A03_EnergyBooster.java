package exam_March2020;

import java.util.Scanner;

public class A03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int orderedSets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double fullPrice = 0;

        switch (fruit) {

            case "Watermelon":
                if (size.equals("small")) {
                    price = 2 * 56;
                } else {
                    price = 5 * 28.7;
                }
                break;
            case "Mango":
                if (size.equals("small")) {
                    price = 2 * 36.66;
                } else {
                    price = 5 * 19.6;
                }
                break;
            case "Pineapple":
                if (size.equals("small")) {
                    price = 2 * 42.1;
                } else {
                    price = 5 * 24.8;
                }
                break;
            case "Raspberry":
                if (size.equals("small")) {
                    price = 2 * 20;
                } else {
                    price = 5 * 15.20;
                }
                break;
        }

        fullPrice = price * orderedSets;

        if (fullPrice >= 400 && fullPrice <= 1000) {
            fullPrice -= fullPrice * 15 / 100;
        } else if (fullPrice>1000){
            fullPrice -= fullPrice * 50 / 100;
        }

        System.out.printf("%.2f lv.", fullPrice);
    }
}
