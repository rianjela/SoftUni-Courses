package ExamPrep;

import java.util.*;

public class L03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> plantRaritiesMap = new LinkedHashMap<>();
        Map<String, List<Integer>> plantRatingsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantDataArr = scanner.nextLine().split("<->");
            plantRaritiesMap.put(plantDataArr[0], plantDataArr[1]);
            plantRatingsMap.put(plantDataArr[0], new ArrayList<>());
        }

        String[] command = scanner.nextLine().split("[ \\-:]+");

        while (!command[0].equals("Exhibition")) {
            String currentPlant = command[1];

            if (!plantRaritiesMap.containsKey(currentPlant)) {
                System.out.println("error");
            } else {

                switch (command[0]) {
                    case "Rate":
                        int currentRating = Integer.parseInt(command[2]);
                        plantRatingsMap.get(currentPlant).add(currentRating);
                        break;
                    case "Update":
                        String currentRarity = command[2];
                        plantRaritiesMap.put(currentPlant, currentRarity);
                        break;
                    case "Reset":
                      plantRatingsMap.put(currentPlant, new ArrayList<>());
                      //  plantRatingsMap.get(currentPlant).clear();
                        break;
                }
            }

            command = scanner.nextLine().split("[ \\-:]+");


        }

        Map<String, Double> avgRatingsMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Integer>> entry : plantRatingsMap.entrySet()) {
            if (entry.getValue().size() > 0) {
                int sumRatings = 0;
                for (int rating : entry.getValue()) {
                    sumRatings += rating;
                }
                double avgRating = 1.0 * sumRatings / entry.getValue().size();
                avgRatingsMap.put(entry.getKey(), avgRating);
            } else {
                avgRatingsMap.put(entry.getKey(), 0.0);
            }
        }

        StringBuilder exhibitionPlants = new StringBuilder();

        for (Map.Entry<String, String> plant : plantRaritiesMap.entrySet()) {
            String namePlant = plant.getKey();
            int rarity = Integer.parseInt(plant.getValue());
            double avgRating = avgRatingsMap.get(plant.getKey());

            exhibitionPlants.append(String.format("- %s; Rarity: %d; Rating: %.2f\n", namePlant, rarity, avgRating));
        }

        System.out.println("Plants for the exhibition:");
        System.out.println(exhibitionPlants);


    }
}
