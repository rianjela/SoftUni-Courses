package E03_Arrays;


import java.util.Scanner;

public class e10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] treasureChestItems = scanner.nextLine().split("\\|");
        String[] capitanCommand = scanner.nextLine().split(" ");
        String stolenItems = "";

        while (!capitanCommand[0].equals("Yohoho!")) {

            if (capitanCommand[0].equals("Loot")) {
                String lootItems = "";

                boolean isContained = false;
                if (treasureChestItems.length > 0) {
                    for (int i = 1; i < capitanCommand.length; i++) {
                        for (int j = 0; j < treasureChestItems.length; j++) {

                            if (capitanCommand[i].equals(treasureChestItems[j])) {
                                isContained = true;
                                break;
                            } else {
                                isContained = false;
                            }
                        }
                        if (!isContained) {
                            lootItems = capitanCommand[i] + " " + lootItems;
                        }
                    }

                    String chestAfterLoot = lootItems + String.join(" ", treasureChestItems);
                    treasureChestItems = chestAfterLoot.split(" ");

                } else {
                    treasureChestItems = new String[capitanCommand.length - 1];
                    for (int i = 0; i < treasureChestItems.length; i++) {
                        treasureChestItems[i] = capitanCommand[i + 1];
                    }
                }


            } else if (capitanCommand[0].equals("Drop")) {
                int dropIndex = Integer.parseInt(capitanCommand[1]);

                if (dropIndex < 0 || dropIndex >= treasureChestItems.length - 1) {
                    capitanCommand = scanner.nextLine().split(" ");
                    continue;
                } else {
                    String droppedItem = treasureChestItems[dropIndex];

                    for (int i = dropIndex; i < treasureChestItems.length - 1; i++) {
                        treasureChestItems[i] = treasureChestItems[i + 1];
                    }
                    treasureChestItems[treasureChestItems.length - 1] = droppedItem;
                }


            } else if (capitanCommand[0].equals("Steal")) {
                int stolenCount = Integer.parseInt(capitanCommand[1]);
                if (stolenCount >= treasureChestItems.length) {
                    printArray(treasureChestItems);
                    System.out.println("Failed treasure hunt.");
                    treasureChestItems = new String[0];

                } else {
                    stolenItems = "";
                    for (int i = treasureChestItems.length - stolenCount; i < treasureChestItems.length; i++) {
                        if (i == treasureChestItems.length - stolenCount) {
                            stolenItems = treasureChestItems[i];
                        } else {
                            stolenItems += ", " + treasureChestItems[i];
                        }
                    }
                    System.out.println(stolenItems);

                    String[] tempTreasureChest = new String[treasureChestItems.length - stolenCount];
                    for (int i = 0; i < tempTreasureChest.length; i++) {
                        tempTreasureChest[i] = treasureChestItems[i];
                    }
                    treasureChestItems = tempTreasureChest;
                }
            }

            capitanCommand = scanner.nextLine().split(" ");
        }

        if (treasureChestItems.length > 0) {
            int sumElements = 0;
            for (String element :
                    treasureChestItems) {
                sumElements += element.length();
            }
            double avgGain = 1.0 * sumElements / treasureChestItems.length;

            System.out.printf("Average treasure gain: %.2f pirate credits.", avgGain);
        }

    }


    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}
