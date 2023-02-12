package E06_ObjectsAndClasses.E07_Google;

public class Company {

    private String companyName;
    private String department;
    private double salary;

    //Constructor
    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f\n", getCompanyName(), getDepartment(), getSalary());
    }

    // Getters & Setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
