package exam_March2020;

import java.util.Scanner;

public class A05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int kgBoughtFood = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int eatenFoodPerMeal = 0;
        int eatenFoodTotal = 0;

        while (!input.equals("Adopted")) {

            eatenFoodPerMeal = Integer.parseInt(input);
            eatenFoodTotal += eatenFoodPerMeal;

            input = scanner.nextLine();
        }

        if (1000 * kgBoughtFood >= eatenFoodTotal) {
            System.out.printf("Food is enough! Leftovers: %d grams.", 1000 * kgBoughtFood - eatenFoodTotal);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(1000 * kgBoughtFood - eatenFoodTotal));
        }

    }
}
