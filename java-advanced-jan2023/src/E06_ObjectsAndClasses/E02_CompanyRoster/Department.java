package E06_ObjectsAndClasses.E02_CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;


    public Department(String name, List<Employee> employeesInTheDepartment) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

}
