package E09_IteratorsAndComparators.E05_ComparingObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            peopleList.add(new Person(input));
            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;

        checkAndPrintMatches(peopleList, index);

    }

    private static void checkAndPrintMatches(List<Person> peopleList, int index) {
        Person personToMatch = peopleList.get(index);

        int[] outputArr = new int[3];
        outputArr[2] = peopleList.size();
        for (Person person : peopleList) {
            if (personToMatch.compareTo(person) == 0) {
                outputArr[0]++;
            } else {
                outputArr[1]++;
            }
        }


        if (outputArr[0] == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(Arrays.toString((outputArr)).replaceAll("[\\[\\],]|", ""));
        }
    }
}
