package lab6_NestedLoops;

import java.util.Scanner;

public class L06_Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        boolean lastFloor = false;


        for (int i = floors; i > 0; i--) {

            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    System.out.printf("L%d%d", i, j);

                } else {
                    if (i % 2 != 0) {
                        System.out.printf("A%d%d", i, j);
                    } else {

                        System.out.printf("O%d%d", i, j);

                    }
                }

                if (j < rooms-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}

