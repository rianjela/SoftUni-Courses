package E07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();

        LinkedHashMap<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            resourcesMap.putIfAbsent(resource, 0);
            resourcesMap.put(resource, resourcesMap.get(resource) + quantity);

            resource = scanner.nextLine();
        }

        resourcesMap.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue()));
    }
}
