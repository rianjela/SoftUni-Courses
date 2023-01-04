package e05_WhileLoop;

import java.util.Scanner;

public class E05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeLvSt = Double.parseDouble(scanner.nextLine());
        double changeSt = Math.round(changeLvSt * 100);
        int coinsCounter = 0;
        double coinsValue = 0;

        while (changeSt > 0) {

            if (changeSt >= 200) {
                changeSt -= 200;
            } else if (changeSt >= 100) {
                changeSt -= 100;
            } else if (changeSt >= 50) {
                changeSt -= 50;
            } else if (changeSt >= 20) {
                changeSt -= 20;
            } else if (changeSt >= 10) {
                changeSt -= 10;
            } else if (changeSt >= 5) {
                changeSt -= 5;
            } else if (changeSt >= 2) {
                changeSt -= 2;
            } else if (changeSt >= 1) {
                changeSt -= 1;
            }

            coinsCounter++;
        }

        System.out.println(coinsCounter);


    }
}
