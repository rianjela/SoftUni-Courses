package E07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> junkMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> legendaryMap = new LinkedHashMap<>();
        legendaryMap.put("shards", 0);
        legendaryMap.put("fragments", 0);
        legendaryMap.put("motes", 0);

        int shards = 0;
        int fragments = 0;
        int motes = 0;

        while (shards < 250 && fragments < 250 && motes < 250) {
            String[] materialsData = scanner.nextLine().toLowerCase().split("\\s++");

            for (int i = 0; i < materialsData.length; i += 2) {
                int currentQuantity = Integer.parseInt(materialsData[i]);
                String currentMaterial = materialsData[i + 1];
                boolean isLegendaryWon = false;
                if (currentMaterial.equals("shards") || currentMaterial.equals("fragments") || currentMaterial.equals("motes")) {
                    legendaryMap.putIfAbsent(currentMaterial, 0);
                    legendaryMap.put(currentMaterial, legendaryMap.get(currentMaterial) + currentQuantity);

                    switch (currentMaterial) {
                        case "shards":
                            shards = legendaryMap.get("shards");
                            if (shards >= 250) {
                                isLegendaryWon = true;
                            }
                            break;
                        case "fragments":
                            fragments = legendaryMap.get("fragments");
                            if (fragments >= 250) {
                                isLegendaryWon = true;
                            }
                            break;
                        case "motes":
                            motes = legendaryMap.get("motes");
                            if (motes >= 250) {
                                isLegendaryWon = true;
                            }
                            break;
                    }

                    if (isLegendaryWon) {
                        break;
                    }

                } else {
                    junkMap.putIfAbsent(currentMaterial, 0);
                    junkMap.put(currentMaterial, junkMap.get(currentMaterial) + currentQuantity);
                }

            }

        }
        String legendaryItem = "";
        if (shards >= 250) {
            legendaryItem = "Shadowmourne";
            legendaryMap.put("shards", legendaryMap.get("shards") - 250);
        } else if (fragments >= 250) {
            legendaryItem = "Valanyr";
            legendaryMap.put("fragments", legendaryMap.get("fragments") - 250);
        } else {
            legendaryItem = "Dragonwrath";
            legendaryMap.put("motes", legendaryMap.get("motes") - 250);
        }

        System.out.printf("%s obtained!\n", legendaryItem);

        System.out.printf("shards: %d\nfragments: %d\nmotes: %d\n", legendaryMap.get("shards"), legendaryMap.get("fragments"), legendaryMap.get("motes"));
        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d\n", entry.getKey(), entry.getValue()));
    }
}
