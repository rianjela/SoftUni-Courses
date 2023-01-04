package L07_AssociativeArrays;

import java.util.*;

public class L03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Java C# PHP PHP JAVA C java

        String[] sequenceArr = scanner.nextLine().toLowerCase().split("\\s+");
        LinkedHashMap<String, Integer> sequenceMap = new LinkedHashMap<>();

        for (String element : sequenceArr) {

            if (!sequenceMap.containsKey(element)) {
                sequenceMap.put(element, 0);
            }

            sequenceMap.put(element, sequenceMap.get(element) + 1);
        }
        List<String> oddRepeats = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : sequenceMap.entrySet()) {

            if (entry.getValue() % 2 != 0){
                oddRepeats.add(entry.getKey());
            }
        }

        System.out.println(oddRepeats.toString().replaceAll("[\\[\\]]", ""));


    }
}
