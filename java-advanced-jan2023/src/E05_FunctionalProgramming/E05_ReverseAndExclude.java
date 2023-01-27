package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връша> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> checkDivision = number -> number % n == 0;
        numbers.removeIf(checkDivision);

        numbers.forEach(num -> System.out.print(num + " "));
    }
}
