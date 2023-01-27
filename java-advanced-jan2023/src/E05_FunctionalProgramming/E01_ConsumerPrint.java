package E05_FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;

public class E01_ConsumerPrint {
    public static void main(String[] args) {
        // Function <приема, връща> -> apply
        // Consumer <приема> -> accept (като void)
        // Supplier <връща> -> get
        // Predicate <приема> -> връща true/false -> test (като boolean)
        // BiFunction <приема1, приема2, връща> -> apply

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        //Use a Consumer <String>
        Consumer<String> printName = name -> System.out.println(name);

        for (String name : names) {
            printName.accept(name);
        }
        // Use a Consumer <String[]>
//        Consumer<String[]> printArr = array -> {
//            for (String currentName : names) {
//                System.out.println(currentName);
//            }
//        };
//
//        printArr.accept(names);
    }

}


