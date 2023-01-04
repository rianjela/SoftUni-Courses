package ExamMiddlePrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .collect(Collectors.toList());


        String[] command = scanner.nextLine().split("\\s+-\\s+");

        while (!command[0].equals("Craft!")) {


            switch (command[0]) {

                case "Collect":
                    String itemToCollect = command[1];
                    if (!isContained(itemsList, itemToCollect)) {
                        itemsList.add(itemToCollect);
                    }
                    break;
                case "Drop":
                    String itemToDrop = command[1];
                    if (isContained(itemsList, itemToDrop)) {
                        itemsList.remove(String.valueOf(itemToDrop));
                    }
                    break;
                case "Combine Items":
                    String[] itemsCombineArr = command[1].split(":");
                    String oldItem = itemsCombineArr[0];
                    String newItem = itemsCombineArr[1];

                    if (isContained(itemsList, oldItem)) {
                        int indexOldItem = itemsList.indexOf(oldItem);
                        itemsList.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String itemToRenew = command[1];
                    if (isContained(itemsList, itemToRenew)) {
                        itemsList.remove(String.valueOf(itemToRenew));
                        itemsList.add(itemToRenew);
                    }
                    break;
            }

            command = scanner.nextLine().split("\\s+-\\s+");
        }

        for (int i = 0; i < itemsList.size(); i++) {
            if (i== itemsList.size()-1){
                System.out.print(itemsList.get(i));
            } else {
                System.out.print(itemsList.get(i)+", ");
            }
        }
    }

    public static boolean isContained(List<String> list, String itemToCheck) {
        boolean isContained = false;
        for (String item : list) {
            if (item.equals(itemToCheck)) {
                isContained = true;
                break;
            }
        }
        return isContained;
    }

}
