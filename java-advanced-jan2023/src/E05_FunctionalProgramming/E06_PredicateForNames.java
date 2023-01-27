package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class E06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връша> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkNameLength = name -> name.length() <= n;

        Arrays.stream(names)
                .filter(checkNameLength)
                .forEach(System.out::println);

    }
}
