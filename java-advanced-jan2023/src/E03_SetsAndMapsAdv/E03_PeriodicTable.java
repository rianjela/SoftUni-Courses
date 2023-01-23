package E03_SetsAndMapsAdv;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class E03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemCompounds = new TreeSet<>();


        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            int length = data.length;
            for (int j = 0; j < length; j++) {
                String currentChemical = data[j];
                chemCompounds.add(currentChemical);
            }
        }

        chemCompounds.forEach(chemical -> System.out.print(chemical + " "));

    }
}
