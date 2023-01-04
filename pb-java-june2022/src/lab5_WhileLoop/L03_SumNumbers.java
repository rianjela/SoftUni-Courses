package lab5_WhileLoop;

import java.util.Scanner;

public class L03_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while(sum < number){
            int numbersAfter = Integer.parseInt(scanner.nextLine());
            sum += numbersAfter;
        }

        System.out.println(sum);
    }
}
