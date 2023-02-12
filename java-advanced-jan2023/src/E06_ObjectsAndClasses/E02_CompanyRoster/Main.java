package E06_ObjectsAndClasses.E02_CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());


        List<Employee> allEmployees = new ArrayList<>();
        Map<String, List<Employee>> departments = new HashMap<>();
        for (int employeesCount = 0; employeesCount < N; employeesCount++) {
            String[] infoEmployee = scanner.nextLine().split("\\s+");
            String name = infoEmployee[0];
            Double salary = Double.parseDouble(infoEmployee[1]);
            String position = infoEmployee[2];
            String department = infoEmployee[3];

            int age = -1;
            String email = "n/a";

            Employee currentEmployee = new Employee(name, salary, position, department, email, age);

            if (infoEmployee.length > 4) {
                if (Character.isDigit(infoEmployee[4].charAt(0))) {
                    age = Integer.parseInt(infoEmployee[4]);
                } else {
                    if (infoEmployee.length == 6) {
                        email = infoEmployee[4];
                        age = Integer.parseInt(infoEmployee[5]);
                    } else {
                        email = infoEmployee[4];
                    }
                }
            }
            currentEmployee.setAge(age);
            currentEmployee.setEmail(email);
            allEmployees.add(currentEmployee);
            departments.putIfAbsent(department, new ArrayList<>());
            departments.get(department).add(currentEmployee);
        }

        double maxSalary = Double.MIN_VALUE;
        String maxDep = "";

        for (Map.Entry<String, List<Employee>> dep : departments.entrySet()) {
            double avgSalary = 0;
            double sum = 0;

            for (Employee employee : dep.getValue()) {
                sum += employee.getSalary();
            }
            avgSalary = sum / dep.getValue().size();
            if (maxSalary < avgSalary) {
                maxSalary = avgSalary;
                maxDep = dep.getKey();
            }
        }

        System.out.printf("Highest Average Salary: %s\n", maxDep);

        departments.get(maxDep).sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        departments.get(maxDep).forEach(employee -> {
            //{name1} {salary1} {email1} {age1}
            System.out.printf("%s %.2f %s %d\n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        });
    }
}

