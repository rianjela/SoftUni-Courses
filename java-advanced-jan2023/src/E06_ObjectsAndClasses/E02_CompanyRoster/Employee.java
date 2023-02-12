package E06_ObjectsAndClasses.E02_CompanyRoster;



public class Employee {

    // mandatory
    private String name;
    private Double salary;
    private String position;
    private String department;

    // optional
    private String email;
    private int age;

    public Double getSalary() {
        return salary;
    }

    public Employee(String name, Double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
