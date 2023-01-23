package E03_SetsAndMapsAdv;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] inputData = scanner.nextLine().toCharArray();
        Map<Character, Integer> charCounterSet = new TreeMap<>();

        for (int i = 0; i < inputData.length; i++) {
            charCounterSet.putIfAbsent(inputData[i], 0);
            charCounterSet.put(inputData[i], charCounterSet.get(inputData[i]) + 1);
        }

        charCounterSet.entrySet().forEach(symbol-> System.out.printf("%s: %d time/s%n", symbol.getKey().toString(), symbol.getValue()));
    }


}
