package L06_ObjectsAndClasses.l05_Students;

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

        for (Student student : allStudents) {
            if (cityName.equals(student.getHometown())){
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
