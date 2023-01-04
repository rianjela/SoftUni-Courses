package lab5_WhileLoop;

import java.util.Scanner;

public class L07_MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int n = Integer.parseInt(input);
            if (minNumber > n){
                minNumber = n;
            }

            input = scanner.nextLine();
        }

        System.out.println(minNumber);
    }
}
