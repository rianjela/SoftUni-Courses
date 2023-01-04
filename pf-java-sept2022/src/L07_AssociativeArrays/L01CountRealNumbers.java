package L07_AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> numbersMap = new TreeMap<>();


        for (double number : numbersArr) {
            if (!numbersMap.containsKey(number)) {
                numbersMap.put(number, 0);
            }
            numbersMap.put(number, numbersMap.get(number) + 1);

        }

        numbersMap.entrySet().forEach(entry -> System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue()));

//        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
//            System.out.printf("%.0f -> %d\n", entry.getKey(), entry.getValue());

//        }


    }
}
