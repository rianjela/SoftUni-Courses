package E03_SetsAndMapsAdv;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            firstSet.add(scanner.nextLine());
        }
        for (int i = 0; i < M; i++) {
            secondSet.add(scanner.nextLine());
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(element -> System.out.print(element + " "));

    }
}
