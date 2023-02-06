package E06_ObjectsAndClasses.E01_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        List<Person> allPeople = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] data = scanner.nextLine().split("\\s+");

            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person currentPerson = new Person(name, age);
            allPeople.add(currentPerson);
        }

        // filter over 30
        allPeople = allPeople.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        //sort by name
        allPeople.sort(Comparator.comparing(person -> person.getName()));

        for (Person person : allPeople) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
