package E05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt)
                .toArray();

        int bombNumber = numbersArr[0];
        int powerNumber = numbersArr[1];
        int sum = 0;


        while (numbersList.contains(bombNumber)) {
        int indexBomb = numbersList.indexOf(bombNumber);
        int indexLeft = indexBomb - powerNumber;
        int indexRight = indexBomb + powerNumber;

            if (indexLeft < 0) {
                indexLeft = 0;
            }
            if (indexRight >= numbersList.size()) {
                for (int i = indexLeft; i < numbersList.size(); i++) {
                    numbersList.set(i, 0);
                }
            } else {
                for (int i = indexLeft; i <= indexRight; i++) {
                    numbersList.set(i, 0);
                }
            }
            numbersList.removeAll(Arrays.asList(0));

        }
            for (int number : numbersList) {
                sum += number;
            }

        System.out.println(sum);
    }


}

