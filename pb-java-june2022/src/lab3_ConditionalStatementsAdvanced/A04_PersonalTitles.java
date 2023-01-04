package lab3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class A04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        switch (sex) {
            case "f":
                if (age < 16) {
                    System.out.println("Miss");
        }       else if (age >= 16) {
            System.out.println("Ms.");
        }
        break;

        case "m":
            if (age < 16) {
                System.out.println("Master");
            }       else if (age >= 16) {
                System.out.println("Mr.");
            }
        break;
    }
}
}

