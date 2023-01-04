package L04_Methods;

import java.util.Scanner;

public class L02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double grade = Double.parseDouble(scanner.nextLine());
        gradeWord(grade);


    }

    public static void gradeWord(double grade) {
        if (grade >= 2.00 && grade < 3) {
            System.out.print("Fail");
        } else if (grade < 3.5) {
            System.out.print("Poor");
        } else if (grade < 4.50) {
            System.out.print("Good");
        } else if (grade < 5.5) {
            System.out.print("Very good");
        } else if (grade <= 6) {
            System.out.print("Excellent");
        }

    }
}
