package exam_July2020;

import java.util.Scanner;

public class E06_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        boolean even = false;


        int a4 = a % 10;
        int a3 = a / 10 % 10;
        int a2 = a / 100 % 10;
        int a1 = a / 1000 % 10;

        int z4 = z % 10;
        int z3 = z / 10 % 10;
        int z2 = z / 100 % 10;
        int z1 = z / 1000 % 10;

        for (int i = a1; i <= z1; i++) {

            if (i % 2 == 0) {
               continue;
            }
            for (int j = a2; j <= z2; j++) {
                if (j % 2 == 0) {
                    continue;
                }
                for (int k = a3; k <= z3; k++) {
                    if (k % 2 == 0) {
                        continue;
                    }
                    for (int l = a4; l <= z4; l++) {

                        if (l % 2 == 0) {
                            continue;
                        }
                            System.out.printf("%d%d%d%d ", i, j, k, l);


                    }
                }
            }

        }


    }

}

