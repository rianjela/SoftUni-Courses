package lab4_ForLoop;

import java.util.Scanner;

public class L02_NumbersNTo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >=1; i--) {

            System.out.println(i);

        }


    }
}
