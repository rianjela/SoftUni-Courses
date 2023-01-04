package E01_BasicSyntax;

import java.util.Scanner;

public class E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeClients = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double pricePerPerson = 0;


        switch (dayOfTheWeek) {
            case "Friday":
                if (typeClients.equals("Students")) {
                    pricePerPerson = 8.45;
                } else if (typeClients.equals("Business")) {
                    pricePerPerson = 10.9;
                } else if (typeClients.equals("Regular")) {
                    pricePerPerson = 15;
                }
                break;
            case "Saturday":
                if (typeClients.equals("Students")) {
                    pricePerPerson = 9.8;
                } else if (typeClients.equals("Business")) {
                    pricePerPerson = 15.6;
                } else if (typeClients.equals("Regular")) {
                    pricePerPerson = 20;
                }
                break;
            case "Sunday":
                if (typeClients.equals("Students")) {
                    pricePerPerson = 10.46;
                } else if (typeClients.equals("Business")) {
                    pricePerPerson = 16;
                } else if (typeClients.equals("Regular")) {
                    pricePerPerson = 22.5;
                }
                break;
        }
        double totalPrice = pricePerPerson * peopleCount;


        if (peopleCount >= 30 && typeClients.equals("Students")) {
            totalPrice -= totalPrice * 15 / 100;
        }
        if (peopleCount >= 100 && typeClients.equals("Business")) {
            totalPrice -= 10 * pricePerPerson;
        }
        if (peopleCount >= 10 && peopleCount <= 20 && typeClients.equals("Regular")) {
            totalPrice -= totalPrice * 5 / 100;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
