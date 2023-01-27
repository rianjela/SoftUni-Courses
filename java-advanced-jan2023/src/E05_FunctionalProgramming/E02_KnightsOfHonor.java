package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връша> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printName);
    }
}
