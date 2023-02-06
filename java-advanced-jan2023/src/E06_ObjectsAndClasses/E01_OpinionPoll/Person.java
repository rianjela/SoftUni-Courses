package E06_ObjectsAndClasses.E01_OpinionPoll;

public class Person {
    private String name;
    private int age;


    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


}
