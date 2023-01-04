package E07_AssociativeArrays;

import java.util.*;

public class E06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String studentName = scanner.nextLine();
            Double currentGrade = Double.parseDouble(scanner.nextLine());
            List<Double> gradesList = new ArrayList<>();

            studentsMap.putIfAbsent(studentName, gradesList);
            studentsMap.get(studentName).add(currentGrade);

        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
        double sumGrades = 0;
        double avgGrade = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                sumGrades += entry.getValue().get(i);
            }
            avgGrade = sumGrades / entry.getValue().size();

            if (avgGrade >= 4.50){
                System.out.printf("%s -> %.2f\n", entry.getKey(), avgGrade);
            }
        }


    }
}
