package exam_March2020;

import java.util.Scanner;

public class A04_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Количеството на бисквитките е 10% от общо изядената храна за деня.


        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());

        int dogFoodTotal = 0;
        int catFoodTotal = 0;
        double biscuits = 0;


        for (int i = 1; i <= days; i++) {


            int dogFoodEaten = Integer.parseInt(scanner.nextLine());
            int catFoodEaten = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                biscuits += (1.0 * catFoodEaten + dogFoodEaten) * 10 / 100;
            }
            dogFoodTotal += dogFoodEaten;
            catFoodTotal += catFoodEaten;


        }
        System.out.printf("Total eaten biscuits: %.0fgr.\n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n", (catFoodTotal + dogFoodTotal) / allFood * 100);
        System.out.printf("%.2f%% eaten from the dog.\n", 1.0 * dogFoodTotal / (catFoodTotal + dogFoodTotal) * 100);
        System.out.printf("%.2f%% eaten from the cat.\n", 1.0 * catFoodTotal / (catFoodTotal + dogFoodTotal) * 100);

    }
}
