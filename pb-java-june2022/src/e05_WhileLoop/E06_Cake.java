package e05_WhileLoop;

import java.util.Scanner;

public class E06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int piecesTaken = 0;
        int inputPieces = 0;
        int piecesDiff = 0;
        boolean noMoreCake = false;

        while (!input.equals("STOP")) {
            inputPieces = Integer.parseInt(input);
            piecesTaken += inputPieces;

            if (piecesTaken > width * length){
                noMoreCake = true;
                break;
            }
            input = scanner.nextLine();
        }
                piecesDiff = Math.abs(piecesTaken-width*length);
            if (noMoreCake){
                System.out.printf("No more cake left! You need %d pieces more.", piecesDiff);
            } else {
                System.out.printf("%d pieces are left.",piecesDiff);
            }
    }
}
