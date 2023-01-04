package e03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class E01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeSeat = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seatsAll = rows*columns;
        double price = 0;

        double premiere = 12;
        double normal = 7.5;
        double discount = 5;

        switch (typeSeat){
            case "Premiere":
                price = seatsAll * premiere;
                break;

            case "Normal":
                price = seatsAll * normal;
                break;

            case "Discount":
                price = seatsAll * discount;
                break;
        }

        System.out.printf("%.2f leva", price);

    }
}
