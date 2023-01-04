package exam_July2022;

import java.util.Scanner;

public class E01_CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int fatPercentage = Integer.parseInt(scanner.nextLine());
        int proteinPercentage = Integer.parseInt(scanner.nextLine());
        int carbsPercentage = Integer.parseInt(scanner.nextLine());
        int caloriesAll = Integer.parseInt(scanner.nextLine());
        int waterPercentage = Integer.parseInt(scanner.nextLine());


        double fatGrams = (1.0 * caloriesAll * fatPercentage / 100) / 9;
        double proteinGrams = (1.0 * caloriesAll * proteinPercentage / 100) / 4;
        double carbsGrams = (1.0 * caloriesAll * carbsPercentage / 100) / 4;

        double foodWeightGr = fatGrams + proteinGrams + carbsGrams;
        double caloriesPerGram = caloriesAll / foodWeightGr;

        double calories = caloriesPerGram * (100 - waterPercentage) / 100;

        System.out.printf("%.4f", calories);

    }
}
