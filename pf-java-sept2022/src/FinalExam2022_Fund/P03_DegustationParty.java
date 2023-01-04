package FinalExam2022_Fund;

import java.util.*;

public class P03_DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String meals = scanner.nextLine();
        String[] mealsInfo = meals.split("\\-");

        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        // Map<String, String> dislikedMeals = new LinkedHashMap<>();
        int counterDisliked = 0;
        while (!mealsInfo[0].equals("Stop")) {
            String guest = mealsInfo[1];
            String meal = mealsInfo[2];

            switch (mealsInfo[0]) {
                case "Like":
                    likedMeals.putIfAbsent(guest, new ArrayList<>());
                   // if (!likedMeals.get(meal).contains(meal)) {
                    if (!containsMeal(likedMeals.get(guest), meal)) {
                        likedMeals.get(guest).add(meal);
                    }
                    break;


                case "Dislike":
                    if (!likedMeals.containsKey(guest)) {
                        System.out.printf("%s is not at the party.\n", guest);
                    } else {


                        //if (likedMeals.get(guest).contains(meals)) {
                        if (containsMeal(likedMeals.get(guest), meal)) {
                            counterDisliked++;
                            System.out.printf("%s doesn't like the %s.\n", guest, meal);
                            likedMeals.get(guest).remove(meal);
                        } else {
                            System.out.printf("%s doesn't have the %s in his/her collection.\n", guest, meal);
                        }
                    }

                    break;
            }


            mealsInfo = scanner.nextLine().split("\\-");
        }

        for (Map.Entry<String, List<String>> entry : likedMeals.entrySet()) {

            System.out.printf("%s: %s\n", entry.getKey(), String.join(", ", entry.getValue()));

        }

        System.out.printf("Unliked meals: %d", counterDisliked);

    }

    private static boolean containsMeal(List<String> list, String toCheck) {
        boolean containsMeal = false;
        for (String meal : list) {
            if (meal.equals(toCheck)) {
                containsMeal = true;
                break;
            }
        }
        return containsMeal;
    }
}
