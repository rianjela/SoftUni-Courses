package e04_ForLoop;

import java.util.Scanner;

public class E02_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int valueMax = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scanner.nextLine());
                sum += a;

            if(a>valueMax){
                valueMax = a;
            }

        }

        if (sum-valueMax == valueMax) {
            System.out.printf("Yes\n" +
                    "Sum = %d", valueMax);
        } else {
            System.out.printf("No\n" +
                    "Diff = %d", Math.abs(sum-2*valueMax));
        }
    }

}