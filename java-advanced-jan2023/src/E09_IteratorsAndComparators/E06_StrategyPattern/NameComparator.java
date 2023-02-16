package E09_IteratorsAndComparators.E06_StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int result = Integer.compare(firstPerson.getName().length(), secondPerson.getName().length());
        if (result == 0) {
            char firstLetter1 = firstPerson.getName().toLowerCase().charAt(0);
            char firstLetter2 = secondPerson.getName().toLowerCase().charAt(0);
            result = Integer.compare(firstLetter1, firstLetter2);
        }
        return result;
    }
}
