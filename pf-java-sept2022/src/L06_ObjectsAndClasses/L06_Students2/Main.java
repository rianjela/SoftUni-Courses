package L06_ObjectsAndClasses.L06_Students2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        List<Student> allStudents = new ArrayList<>();

        while (!input[0].equals("end")) {
            String firstName = input[0];
            String lastName = input[1];
            int ageStudent = Integer.parseInt(input[2]);
            String homeTown = input[3];

            Student currentStudent = new Student(firstName, lastName, ageStudent, homeTown);
            allStudents.add(currentStudent);

            input = scanner.nextLine().split("\\s+");
        }

        String cityName = scanner.nextLine();

        for (int i = 1; i < allStudents.size() - 1; i++) {
            Student previousStudent = allStudents.get(i - 1);
            Student currentStudent = allStudents.get(i);

            if (previousStudent.getFirstName().equals(currentStudent.getFirstName()) && previousStudent.getLastName().equals(currentStudent.getLastName())) {
                allStudents.remove(i - 1);
                i = 0;
            }

        }


        for (Student student : allStudents) {
            if (cityName.equals(student.getHometown())) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
