package L05_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class L02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.
//        Function<String, Integer> parse = s -> Integer.parseInt(s);
//
//        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
//                .map(elem -> parse.apply(elem))
//                .collect(Collectors.toList());
//
//        // .mapToInt(a -> a) //identity function - за да не променяме Stream <Integer> и да имаме sum()
//        int sum = numbers
//                .stream()
//                .mapToInt(a -> a)
//                .sum();
//
//        System.out.printf("Count = %d%n", numbers.size());
//        System.out.printf("Sum = %d", sum);


        //2.

        List<String> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int sum = 0;
        BiFunction<Integer, String, Integer> parseAndAdd = (acc, curr) -> acc + Integer.parseInt(curr);

        for (String number : numbers) {
            sum = parseAndAdd.apply(sum, number);
        }
            System.out.println("Count = " + numbers.size());
            System.out.println("Sum = " + sum);

    }
}
