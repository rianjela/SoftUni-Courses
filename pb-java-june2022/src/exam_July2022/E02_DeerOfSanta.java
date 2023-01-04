package exam_July2022;

import java.util.Scanner;

public class E02_DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAway = Integer.parseInt(scanner.nextLine());
        int kgLeftFood = Integer.parseInt(scanner.nextLine());

        double kgFoodPerDayD1 = Double.parseDouble(scanner.nextLine());
        double kgFoodPerDayD2 = Double.parseDouble(scanner.nextLine());
        double kgFoodPerDayD3 = Double.parseDouble(scanner.nextLine());


        double allFoodNeeded = daysAway * (kgFoodPerDayD1 + kgFoodPerDayD2 + kgFoodPerDayD3);


        if (kgLeftFood >= allFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor (kgLeftFood - allFoodNeeded));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFoodNeeded - kgLeftFood));
        }
    }
}
