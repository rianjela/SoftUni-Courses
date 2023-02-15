package E05_FunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Function <приема, връща> -> apply
// Consumer <приема> -> accept (като void)
// Supplier <връща> -> get
// Predicate <приема> -> връща true/false -> test (като boolean)
// BiFunction <приема1, приема2, връща> -> apply

public class E10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toCollection(ArrayList::new));
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            Predicate<String> predicate = null;

            String criteria = input.split("\\s+")[2];

            if (input.contains("Length")) {
                predicate = x -> x.length() == Integer.parseInt(criteria);
            } else if (input.contains("StartsWith")) {
                predicate = x -> x.startsWith(criteria);
            } else {
                predicate = x -> x.endsWith(criteria);
            }

            if (input.contains("Remove")) {
                ArrayList<String> toRemove = new ArrayList<>();
                for (String guest : guests) {
                    if (predicate.test(guest)) {
                        toRemove.add(guest);
                    }
                }
                guests.removeAll(toRemove);
            } else {
                ArrayList<String> toAdd = new ArrayList<>();
                for (String guest : guests) {
                    if (predicate.test(guest)) {
                        toAdd.add(guest);
                    }
                }
                guests.addAll(toAdd);
            }

            input = scanner.nextLine();
        }

        if (guests.isEmpty()) {

            System.out.println("Nobody is going to the party!");
        } else {
            System.out.println(guests
                    .stream()
                    .sorted()
                    .collect(Collectors.toCollection(ArrayList::new))
                    .toString()
                    .replaceAll("([\\[\\]])", "") + " are going to the party!");
        }
    }

}

