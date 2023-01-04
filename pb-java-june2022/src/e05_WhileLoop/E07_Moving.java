package e05_WhileLoop;

import java.util.Scanner;

public class E07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int roomVolume = width * length * height;

        int boxes = 0;
        int allBoxesVolume = 0;

        boolean roomIsFull = false;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            boxes = Integer.parseInt(input);
            allBoxesVolume += boxes;

            if (allBoxesVolume >= roomVolume) {
                roomIsFull = true;
                break;
            }

            input= scanner.nextLine();
        }

        if (roomIsFull){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(allBoxesVolume-roomVolume));
        } else {
            System.out.printf("%d Cubic meters left.", Math.abs(allBoxesVolume-roomVolume));
        }
    }
}
