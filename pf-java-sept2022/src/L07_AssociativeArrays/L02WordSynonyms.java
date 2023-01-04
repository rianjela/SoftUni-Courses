package L07_AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class L02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> synonymMap = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();

            if (!synonymMap.containsKey(word)){
                synonymMap.put(word, new ArrayList<>());
            }

            synonymMap.get(word).add(scanner.nextLine());
            synonymMap.put(word, synonymMap.get(word));

        }

        synonymMap.entrySet().forEach(entry -> System.out.printf("%s - %s\n", entry.getKey(), entry.getValue().toString().replaceAll("[\\[\\]]", "")));

    }
}
