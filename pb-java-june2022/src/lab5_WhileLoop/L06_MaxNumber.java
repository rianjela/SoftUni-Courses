package lab5_WhileLoop;

import java.util.Scanner;

public class L06_MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int n = Integer.parseInt(input);
            if (maxNumber < n){
                maxNumber = n;
            }

            input = scanner.nextLine();
        }

        System.out.println(maxNumber);
    }
}
