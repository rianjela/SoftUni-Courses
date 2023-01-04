package e06_NestedLoops;

import java.util.Scanner;

public class E01_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean bigger = false;


        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (current>n){
                    bigger = true;
                    break;
                }else{
                    System.out.printf("%d ", current);
                    current++;
                }
                }
                if (bigger){
                    break;
            }
                System.out.println("");
        }
    }
}
