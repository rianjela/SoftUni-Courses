package L05_List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < numberList.size() - 1; i++) {
            if (numberList.get(i).equals(numberList.get(i + 1))) {
                numberList.set(i, numberList.get(i) + numberList.get(i + 1));
                numberList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinNumbers(numberList));

    }

    private static String joinNumbers(List<Double> list) {
        String joinedNumbers = "";

        for (int i = 0; i < list.size(); i++) {
            joinedNumbers += new DecimalFormat("0.#").format(list.get(i)) + " ";
        }
        return joinedNumbers;
    }




}
