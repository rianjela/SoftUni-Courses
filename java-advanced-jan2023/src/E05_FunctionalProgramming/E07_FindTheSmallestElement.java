package E05_FunctionalProgramming;

import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връща> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        Consumer<List<Integer>> printLastMinIndex = list -> {
//            int minElement = Collections.min(list);
//            System.out.println(list.lastIndexOf(minElement));
//        };
//
//        printLastMinIndex.accept(numbers);

        Function<List<Integer>, Integer> getLastMinIndex = list-> list.lastIndexOf(Collections.min(list));
        System.out.println(getLastMinIndex.apply(numbers));
    }

}
