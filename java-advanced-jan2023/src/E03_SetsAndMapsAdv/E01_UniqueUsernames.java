package E03_SetsAndMapsAdv;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());

        Set<String> usernamesSet = new LinkedHashSet<>();

        for (int i = 0; i < inputCount; i++) {
            usernamesSet.add(scanner.nextLine());
        }

        usernamesSet.forEach(username -> System.out.println(username) );
    }
}
