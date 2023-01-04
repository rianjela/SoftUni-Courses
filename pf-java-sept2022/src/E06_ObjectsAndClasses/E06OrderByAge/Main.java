package E06_ObjectsAndClasses.E06OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personData = scanner.nextLine().split("\\s+");
        List<Person> allPeople = new ArrayList<>();

        while (!personData[0].equals("End")) {
            String name = personData[0];
            String personID = personData[1];
            int age = Integer.parseInt(personData[2]);
            ;

            allPeople.add(new Person(name, personID, age));

            personData = scanner.nextLine().split("\\s+");
        }

        allPeople.sort(Comparator.comparing(Person::getAge));

        for (Person person : allPeople) {
            System.out.println(person);
        }

    }
}
