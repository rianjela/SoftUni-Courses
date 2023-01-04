package E02_DataTypesАndVariables;

import java.util.Scanner;

public class e01_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int calculation = (n1 + n2) / n3 * n4;

        System.out.println(calculation);
    }
}
