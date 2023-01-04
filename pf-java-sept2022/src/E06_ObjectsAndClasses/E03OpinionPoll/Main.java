package E06_ObjectsAndClasses.E03OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> allPeople = new ArrayList<>();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < peopleCount; i++) {
            String[] currentPerson = scanner.nextLine().split("\\s+");
            allPeople.add(new Person(currentPerson[0], Integer.parseInt(currentPerson[1])));
        }

        for (Person person : allPeople) {
            if (person.getAge() > 30){
                System.out.println(person);
            }
        }
    }
}
