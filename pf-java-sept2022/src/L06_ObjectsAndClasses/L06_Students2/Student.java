package L06_ObjectsAndClasses.L06_Students2;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public Student(String firstName, String lastName, int age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setAge (int newAge) {
        this.age = newAge;
    }

    public void setHometown (String newTown){
        this.hometown = newTown;
    }

}
