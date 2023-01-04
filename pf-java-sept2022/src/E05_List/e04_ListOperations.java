package E05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandArr = input.split("\\s+");
            switch (commandArr[0]) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandArr[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandArr[1]);
                    int insertIndex = Integer.parseInt(commandArr[2]);
                    if (insertIndex < 0 || insertIndex >= numbersList.size()) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbersList.add(insertIndex, numberToInsert);
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(commandArr[1]);
                    if (removeIndex < 0 || removeIndex >= numbersList.size()) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbersList.remove(removeIndex); //needs check!
                    }
                    break;
                case "Shift":
                        int count = Integer.parseInt(commandArr[2]);
                    if (commandArr[1].equals("left")){
                        for (int i = 0; i < count; i++) {
                            int firstNumber = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(firstNumber);
                        }

                    } else if (commandArr[1].equals("right")){

                        for (int i = 0; i < count; i++) {
                            int lastNumber = numbersList.get(numbersList.size()-1);
                            numbersList.remove(numbersList.size()-1);
                            numbersList.add(0, lastNumber);
                        }
                    }

                        break;

            }
            input = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}