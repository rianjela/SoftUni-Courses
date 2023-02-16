package E09_IteratorsAndComparators.E06_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Person> peopleNames = new TreeSet<>(new NameComparator());
        TreeSet<Person> peopleAge = new TreeSet<>(new AgeComparator());

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
        String input = scanner.nextLine();
        peopleNames.add(new Person(input));
        peopleAge.add(new Person(input));
        }

        peopleNames.forEach(System.out::println);
        peopleAge.forEach(System.out::println);

    }
}
