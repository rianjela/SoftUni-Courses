package L05_List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class l07_RemoveNegativesAndReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) < 0) {
                numbersList.remove(i);
                i--;
            }
        }

        if (numbersList.size() > 0) {
            Collections.reverse(numbersList);
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("empty");
        }

    }
}
