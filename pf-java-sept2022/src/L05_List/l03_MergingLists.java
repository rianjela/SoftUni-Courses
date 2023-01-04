package L05_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l03_MergingLists {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numberList2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> combinedList = new ArrayList<>();


        if (numbersList1.size() > numberList2.size()) {
            for (int i = 0; i < numberList2.size(); i++) {
                combinedList.add(numbersList1.get(i));
                combinedList.add(numberList2.get(i));
            }
            for (int i = numberList2.size(); i < numbersList1.size(); i++) {
                combinedList.add(numbersList1.get(i));
            }
        } else {
            for (int i = 0; i < numbersList1.size(); i++) {
                combinedList.add(numbersList1.get(i));
                combinedList.add(numberList2.get(i));
            }
            for (int i = numbersList1.size(); i < numberList2.size(); i++) {
                combinedList.add(numberList2.get(i));
            }
        }

        System.out.println(joinIntNumbers(combinedList));

    }

    private static String joinIntNumbers(List<Integer> list) {
        String joinedNumbers = "";

        for (int i = 0; i < list.size(); i++) {
            joinedNumbers += list.get(i) + " ";
        }
        return joinedNumbers;
    }

}
