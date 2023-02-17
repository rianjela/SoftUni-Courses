package E02_MultidimensionalArrays;

import java.util.Scanner;

public class E08_TheHeiganDance {

    private static final String SPLIT_REGEX = "\\s+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerHP = 18500;
        double bossHP = 3000000;

        double dmgPerTurn = Double.parseDouble(scanner.nextLine());

        String[][] arena = new String[15][15];
        int playerRow = 7;
        int playerCol = 7;
        String lastSpell = "";

        while (playerHP > 0) {

            String[] input = scanner.nextLine().split(SPLIT_REGEX);
            String spell = input[0];
            int spellRow = Integer.parseInt(input[1]);
            int spellCol = Integer.parseInt(input[2]);

            bossHP -= dmgPerTurn;

            if (lastSpell.equals("Plague Cloud")) {
                playerHP -= 3500;
            }

            if (bossHP <= 0 || playerHP <= 0) {
                break;
            }

            if (isInAOE(playerRow, playerCol, spellRow, spellCol)) {
                //check if player can run away
                if (!isInAOE(playerRow - 1, playerCol, spellRow, spellCol) && isInArea(playerRow - 1)) {
                    //MOVE UP
                    playerRow--;
                    lastSpell = "";
                } else if (!isInAOE(playerRow, playerCol + 1, spellRow, spellCol) && isInArea(playerCol + 1)) {
                    //MOVE RIGHT
                    playerCol++;
                    lastSpell = "";
                } else if (!isInAOE(playerRow + 1, playerCol, spellRow, spellCol) && isInArea(playerRow + 1)) {
                    //MOVE DOWN
                    playerRow++;
                    lastSpell = "";
                } else if (!isInAOE(playerRow, playerCol - 1, spellRow, spellCol) && isInArea(playerCol - 1)) {
                    //MOVE LEFT
                    playerCol--;
                    lastSpell = "";
                } else {
                    //taking dmg from BOSS
                    switch (spell) {
                        case "Cloud":
                            playerHP -= 3500;
                            lastSpell = "Plague Cloud";
                            break;
                        case "Eruption":
                            playerHP -= 6000;
                            lastSpell = "Eruption";
                            break;
                    }
                }
            }
        }

        if (bossHP <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", bossHP);
        }

        if (playerHP <= 0) {
            System.out.printf("Player: Killed by %s%n", lastSpell);
        } else {
            System.out.printf("Player: %d%n", playerHP);
        }

        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);

    }

    // check if we are in the matrix area
    private static boolean isInArea(int coordinates) {
        return coordinates >= 0 && coordinates <= 14;
    }

    //check if the player is in the DMG area
    private static boolean isInAOE(int playerRow, int playerCol, int spellRow, int spellCol) {
        return playerRow >= spellRow - 1 && playerRow <= spellRow + 1 && playerCol >= spellCol - 1 && playerCol <= spellCol + 1;
    }

}
