package E07_AssociativeArrays;

import java.util.*;

public class E05_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> courseMap = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] courseData = input.split("\\s+:\\s+");
            String courseName = courseData[0];
            String studentName = courseData[1];
            courseMap.putIfAbsent(courseName, new ArrayList<>());
            List<String> currentStudentsList = courseMap.get(courseName);
            currentStudentsList.add(studentName);
            courseMap.put(courseName, currentStudentsList);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
            for (String name : entry.getValue()) {
                System.out.printf("-- %s\n", name);
            }
        }


    }
}
