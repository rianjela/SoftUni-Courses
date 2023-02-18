package Exam_Prep.Exam_22October2022;

import java.util.*;
import java.util.stream.Collectors;


public class E01_EnergyDrinks {

    static final int MAX_CAFFEINE = 300;
    static final String REGEX = ",\\s+";
    static final String PRINT_SEPARATOR = ", ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> mgCaffeine = new ArrayDeque<>();
        List<Integer> energyDrinks = new ArrayList<>();

        // input data
        int[] caffeineData = Arrays
                .stream(scanner.nextLine().trim().split(REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < caffeineData.length; i++) {
            mgCaffeine.push(caffeineData[i]);
        }

        int[] drinksData = Arrays
                .stream(scanner.nextLine().split(REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 0; i < drinksData.length; i++) {
            energyDrinks.add(drinksData[i]);
        }

        // calculating caffeine


        int caffeineForTheDay = 0;
        while (!energyDrinks.isEmpty() && !mgCaffeine.isEmpty()) {
            int lastMg = mgCaffeine.peek();
            int drink = energyDrinks.get(0);

            //take the last milligrams of caffeinе and the first energy drink, and multiply them
            int caffeineInDrink = drink * lastMg;

            mgCaffeine.pop();
            energyDrinks.remove(0);

            if (caffeineForTheDay + caffeineInDrink <= 300) {
                caffeineForTheDay += caffeineInDrink;
            } else {
                energyDrinks.add(drink);
                caffeineForTheDay -= 30;
            }
            if (caffeineForTheDay < 0) {
                caffeineForTheDay = 0;
            }
        }


        //print

        if (!energyDrinks.isEmpty()) {
            System.out.print("Drinks left: ");
            printList(energyDrinks);
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", caffeineForTheDay);


    }

    private static void printList(List<Integer> energyDrinks) {
        for (int i = 0; i < energyDrinks.size(); i++) {
            if (i != energyDrinks.size() - 1) {
                System.out.print(energyDrinks.get(i) + PRINT_SEPARATOR);
            } else {
                System.out.println(energyDrinks.get(i));
            }
        }
    }
}
