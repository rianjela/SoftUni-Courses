package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връща> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Comparator<Integer> comparator = ((first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo(second);
            }
        });
        nums.stream().sorted(comparator).forEach(num -> System.out.print(num + " "));
    }
}
