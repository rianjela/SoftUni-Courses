package L02_DataTypesAndVariables;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class L08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char input = scanner.nextLine().charAt(0);

        if (isUpperCase(input)){
            System.out.println("upper-case");
        } else{
            System.out.println("lower-case");
        }
    }
}

