package E06_ObjectsAndClasses.E02_CompanyRoster;

public class Employee {

    // mandatory
    private String name;
    private Double salary;
    private String position;
    private Department department;

    // optional
    private String email;
    private int age;

    public Employee(String name, Double salary, String position, Department department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = "n/a";
        this.age = -1;
    }



}
