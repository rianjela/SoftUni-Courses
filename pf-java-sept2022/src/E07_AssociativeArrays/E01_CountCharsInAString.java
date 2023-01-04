package E07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArr = scanner.nextLine().replaceAll("\\s+", "").toCharArray();
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();


        for (char character : charArr) {
//            if (!charMap.containsKey(character)) {
//                charMap.put(character, 0);
//            }

            charMap.putIfAbsent(character, 0);
            charMap.put(character, charMap.get(character) + 1);

        }

        charMap.entrySet().forEach(entry -> System.out.printf("%c -> %d\n", entry.getKey(), entry.getValue()));

    }
}
