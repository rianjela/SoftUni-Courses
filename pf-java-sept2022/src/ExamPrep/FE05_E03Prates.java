package ExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FE05_E03Prates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();

        String regex = "[|]{2}";
        String citiesData = scanner.nextLine();
        while (!citiesData.equals("Sail")) {
            String city = citiesData.split(regex)[0];
            int population = Integer.parseInt(citiesData.split(regex)[1]);
            int gold = Integer.parseInt(citiesData.split(regex)[2]);

            populationMap.putIfAbsent(city, 0);
            goldMap.putIfAbsent(city, 0);

            populationMap.put(city, populationMap.get(city) + population);
            goldMap.put(city, goldMap.get(city) + gold);

            citiesData = scanner.nextLine();
        }

        String actionData = scanner.nextLine();

        while (!actionData.equals("End")) {
            String currentAction = actionData.split("=>")[0];
            String town = actionData.split("=>")[1];
            int peopleInTown = populationMap.get(town);
            int goldInTown = goldMap.get(town);

            switch (currentAction) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(actionData.split("=>")[2]);
                    int stolenGold = Integer.parseInt(actionData.split("=>")[3]);

                    if (peopleInTown > peopleKilled && goldInTown > stolenGold) {
                        populationMap.put(town, populationMap.get(town) - peopleKilled);
                        goldMap.put(town, goldMap.get(town) - stolenGold);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, stolenGold, peopleKilled);

                    } else {
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n", town, stolenGold, peopleKilled);
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s has been wiped off the map!\n", town);
                    }
                    break;
                case "Prosper":
                    int addedGold = Integer.parseInt(actionData.split("=>")[2]);
                    if (addedGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        goldMap.put(town, goldMap.get(town) + addedGold);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n", addedGold, town, goldMap.get(town));
                    }

                    break;
            }

            actionData = scanner.nextLine();
        }

        if (populationMap.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", populationMap.size());

            for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {

                System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }




    }
}
