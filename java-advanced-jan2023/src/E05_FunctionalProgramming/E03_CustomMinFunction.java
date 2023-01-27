package E05_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E03_CustomMinFunction {
    public static void main(String[] args) {
        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връша> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // без функции
//        System.out.println(Collections.min(numbers));

        // Use Consumer
//        Consumer<List<Integer>> printMin = list -> System.out.println(Collections.min(list));
//        printMin.accept(numbers);

        // Use Function
        Function<List<Integer>, Integer> getMinNum = list -> Collections.min(list);
        System.out.println(getMinNum.apply(numbers));
    }
}
