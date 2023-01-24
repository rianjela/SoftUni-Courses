package L05_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class L01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());

        //num -> { повече операции + return
        // ...
        // ...
        // return num % 2 != 0;}
        numbers.removeIf(num -> num % 2 != 0);
        printWithSeparator(numbers);
        System.out.println();
        //.sort - променя колекцията
        //.stream().sorted() - връща нова колекция
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        printWithSeparator(sortedNumbers);


    }

    private static void printWithSeparator(List<Integer> sortedNumbers) {
        for (int i = 0; i < sortedNumbers.size(); i++) {
            System.out.print(sortedNumbers.get(i));
            if (i < sortedNumbers.size() - 1) {
                System.out.print(", ");
            }
        }
    }


}


