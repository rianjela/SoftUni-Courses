package E01Extra_BasicSyntax;

import java.util.Scanner;

public class EM03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String game = scanner.nextLine();


        double price = 0;


        while (!game.equals("Game Time")) {
            switch (game) {
                case "RoverWatch Origins Edition":
                    price = 39.99;

                    if (currentBalance == 0) {
                        System.out.println("Out of money!");
                    } else if (currentBalance < price) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                    }
                    break;
                case "CS: OG":
                    price = 15.99;
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    break;
                case "Honored 2":
                    price = 59.99;
                    break;
                case "RoverWatch":
                    price = 29.99;
                    break;
                case "OutFall 4":
                    price = 39.99;
                    break;

                default:
                    System.out.println("Not Found");
                    break;


            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
        }
        game = scanner.nextLine();
    }
}

