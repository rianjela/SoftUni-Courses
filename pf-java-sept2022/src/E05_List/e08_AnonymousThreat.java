package E05_List;

import java.util.*;
import java.util.stream.Collectors;

public class e08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("3:1")) {
            String[] commandArr = commandInput.split("\\s+");

            switch (commandArr[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int endIndex = Integer.parseInt(commandArr[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    } else if (startIndex > inputList.size() - 1) {
                        startIndex = inputList.size() - 1;
                    }
                    if (endIndex > inputList.size() - 1) {
                        endIndex = inputList.size() - 1;
                    } else if (endIndex < 0) {
                        endIndex = 0;
                    }
                    String sum = "";

                    for (int i = startIndex; i <= endIndex; i++) {
                        sum += inputList.get(i);
                        inputList.set(i, "");
                    }
                    inputList.add(startIndex, sum);
                    inputList.removeAll(List.of(""));
                    break;

                case "divide":
                    int index = Integer.parseInt(commandArr[1]);
                    int partitions = Integer.parseInt(commandArr[2]);

                    if (index >= 0 && index < inputList.size()) {
                        List<String> newElementsList = new ArrayList<>();

                        List<String> indexElementList = Arrays.stream(inputList.get(index).split(""))
                                .collect(Collectors.toList());

                        int elementToDivideLength = inputList.get(index).length();
                        if (partitions != 0) {
                            int partitionSize = elementToDivideLength / partitions;
                            String sumCurrent = "";
                            if (partitionSize != 0) {
                                if (elementToDivideLength % partitionSize == 0) {

                                    for (int i = 0; i < partitions; i++) {

                                        for (int j = 0; j < partitionSize; j++) {
                                            sumCurrent += indexElementList.get(j);
                                            indexElementList.set(j, "");
                                        }

                                        newElementsList.add(sumCurrent);
                                        sumCurrent = "";
                                        indexElementList.removeAll(List.of(""));
                                    }

                                } else {
                                    for (int i = 0; i < partitions - 1; i++) {

                                        for (int j = 0; j < partitionSize; j++) {
                                            sumCurrent += indexElementList.get(j);
                                            indexElementList.set(j, "");
                                        }

                                        newElementsList.add(sumCurrent);
                                        sumCurrent = "";
                                        indexElementList.removeAll(List.of(""));
                                    }

                                    String lastElement = "";
                                    for (String string : indexElementList) {
                                        lastElement += string;
                                    }
                                    newElementsList.add(lastElement);
                                }

                                Collections.reverse(newElementsList);
                                inputList.remove(index);
                                for (int i = 0; i < newElementsList.size(); i++) {
                                    inputList.add(index, newElementsList.get(i));
                                }
                            }
                        }
                    }
                    break;
            }

            commandInput = scanner.nextLine();
        }

        System.out.println(String.join(" ", inputList));
    }
}
