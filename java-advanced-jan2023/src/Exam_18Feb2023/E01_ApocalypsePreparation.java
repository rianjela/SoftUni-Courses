package Exam_18Feb2023;

import java.util.*;

public class E01_ApocalypsePreparation {
    static final String SPLIT_REGEX = "\\s+";
    static final int PATCH = 30;
    static final int BANDAGE = 40;
    static final int MEDKIT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> textilesDeque = new ArrayDeque<>();
        List<Integer> medsList = new ArrayList<>();

        // reading and adding textiles and medicaments
        int[] textileDataArr = Arrays
                .stream(scanner.nextLine().trim().split(SPLIT_REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = textileDataArr.length - 1; i >= 0; i--) {
            textilesDeque.push(textileDataArr[i]);
        }

        int[] medDataArr = Arrays
                .stream(scanner.nextLine().trim().split(SPLIT_REGEX))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < medDataArr.length; i++) {
            medsList.add(medDataArr[i]);
        }

        Map<String, Integer> itemsCreatedMap = new TreeMap<>();
        itemsCreatedMap.put("Patch", 0);
        itemsCreatedMap.put("Bandage", 0);
        itemsCreatedMap.put("MedKit", 0);

        //combining meds
        while (!textilesDeque.isEmpty() && !medsList.isEmpty()) {
            int itemsSum = 0;

            int currentTextile = textilesDeque.peek();
            int currentMed = medsList.get(medsList.size() - 1);
            boolean isCreatedItem = false;
            itemsSum = currentTextile + currentMed;


            if (itemsSum > MEDKIT) {
                itemsCreatedMap.put("MedKit", itemsCreatedMap.get("MedKit") + 1);
                textilesDeque.pop();
                medsList.remove(medsList.size() - 1);
                int newMed = itemsSum - MEDKIT + medsList.remove(medsList.size() - 1);
                medsList.add(medsList.size(), newMed);
                continue;
            } else {

                switch (itemsSum) {

                    case PATCH:
                        itemsCreatedMap.put("Patch", itemsCreatedMap.get("Patch") + 1);

                        isCreatedItem = true;
                        break;
                    case BANDAGE:
                        itemsCreatedMap.put("Bandage", itemsCreatedMap.get("Bandage") + 1);
                        isCreatedItem = true;
                        break;
                    case MEDKIT:
                        itemsCreatedMap.put("MedKit", itemsCreatedMap.get("MedKit") + 1);
                        isCreatedItem = true;
                        break;
                }
            }

            if (isCreatedItem) {
                textilesDeque.pop();
                medsList.remove(medsList.size() - 1);
            } else {
                textilesDeque.pop();
                int newMed = medsList.remove(medsList.size() - 1) + 10;
                medsList.add(newMed);
            }
        }


        //PRINT
        if (textilesDeque.isEmpty() && medsList.isEmpty()) {
            System.out.println("Textiles and medicaments are both empty.");
        } else {

            if (textilesDeque.isEmpty()) {
                System.out.println("Textiles are empty.");
            }
            if (medsList.isEmpty()) {
                System.out.println("Medicaments are empty.");
            }


        }

        itemsCreatedMap = mapToList(itemsCreatedMap);

        printItems(itemsCreatedMap);

        printMeds(medsList);

        if (!textilesDeque.isEmpty()) {
            System.out.print("Textiles left: ");

            //print TEXTILES
            printDeque(textilesDeque);
        }

    }

    //print MEDICAMENTS
    private static void printMeds(List<Integer> medsList) {
        if (!medsList.isEmpty()) {
            System.out.print("Medicaments left: ");
            for (int i = 0; i < medsList.size(); i++) {

                    if (i != medsList.size() - 1) {
                        System.out.printf("%d, ", medsList.get(i));
                    } else {
                        System.out.printf("%d", medsList.get(i));
                    }
            }
        }
    }

    //print TEXTILES
    private static void printDeque(ArrayDeque<Integer> textilesDeque) {
        while (!textilesDeque.isEmpty()) {
            if (textilesDeque.size() != 1) {
                System.out.printf("%d, ", textilesDeque.peekFirst());
                textilesDeque.pop();
            } else {
                System.out.printf("%d%n", textilesDeque.peekFirst());
                textilesDeque.pop();
            }
        }
    }

    //PRINT ITEMS
    private static void printItems(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }
        }
    }

    // Convert map to List
    private static Map<String, Integer> mapToList(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, (l1, l2) -> {
            int first = l1.getValue();
            int second = l2.getValue();
            if (first > second) {
                return -1;
            } else {
                return +1;
            }
        });
        LinkedHashMap<String, Integer> result = new LinkedHashMap();

        for (Map.Entry<String, Integer> el : list) {
            result.put(el.getKey(), el.getValue());
        }
        return result;
    }


}
