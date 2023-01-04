package L05_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            if (command.contains("Contains")) {
                String[] commandArr = command.split(" ");
                boolean contains = false;
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) == Integer.parseInt(commandArr[1])) {
                        contains = true;
                        break;
                    }
                }

                if (contains) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (command.contains("Print even")) {
                List<Integer> evenNums = new ArrayList<>();
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) % 2 == 0) {
                        evenNums.add(numbersList.get(i));
                    }
                }
                System.out.println(joinIntNumbers(evenNums));
            } else if (command.contains("Print odd")) {
                List<Integer> oddNums = new ArrayList<>();
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) % 2 != 0) {
                        oddNums.add(numbersList.get(i));
                    }
                }
                System.out.println(joinIntNumbers(oddNums));
            } else if (command.contains("Get sum")) {
                int sum = 0;
                for (int number : numbersList) {
                    sum += number;
                }
                System.out.println(sum);


            } else if (command.contains("Filter")) {
                String[] commandFilter = command.split(" ");
                switch (commandFilter[1]) {
                    case "<":
                        List<Integer> tempList = new ArrayList<>();
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandFilter[2]) > numbersList.get(i)) {
                                tempList.add(numbersList.get(i));
                            }
                        }
                        System.out.println(joinIntNumbers(tempList));
                        break;
                    case ">":
                        tempList = new ArrayList<>();
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandFilter[2]) < numbersList.get(i)) {
                                tempList.add(numbersList.get(i));
                            }
                        }
                        System.out.println(joinIntNumbers(tempList));
                        break;
                    case ">=":
                        tempList = new ArrayList<>();
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandFilter[2]) <= numbersList.get(i)) {
                                tempList.add(numbersList.get(i));
                            }
                        }
                        System.out.println(joinIntNumbers(tempList));
                        break;
                    case "<=":
                        tempList = new ArrayList<>();
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (Integer.parseInt(commandFilter[2]) >= numbersList.get(i)) {
                                tempList.add(numbersList.get(i));
                            }
                        }
                        System.out.println(joinIntNumbers(tempList));
                        break;
                }

            }

//System.out.println(myList.toString().replaceAll("[\\[\\],]", ""));

            command = scanner.nextLine();
        }
    }

    private static String joinIntNumbers(List<Integer> list) {
        String joinedNumbers = "";

        for (int i = 0; i < list.size(); i++) {
            joinedNumbers += list.get(i) + " ";
        }
        return joinedNumbers;
    }
}
