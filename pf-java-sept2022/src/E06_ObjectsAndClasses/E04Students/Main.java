package E06_ObjectsAndClasses.E04Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> allStudents = new ArrayList<>();
        int studentsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < studentsCount; i++) {
            String[] currentStudent = scanner.nextLine().split("\\s+");
            allStudents.add(new Student(currentStudent[0], currentStudent[1], Double.parseDouble(currentStudent[2])));
        }

        allStudents.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
}
