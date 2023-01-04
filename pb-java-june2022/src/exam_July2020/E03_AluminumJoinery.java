package exam_July2020;

import java.util.Scanner;

public class E03_AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int joineryCount = Integer.parseInt(scanner.nextLine());
        String joineryType = scanner.nextLine();
        String delivery = scanner.nextLine();
        double deliveryPrice = 0;
        double joineryPrice = 0;
        double joineryTotalPrice = 0;

        if (joineryCount < 10) {
            System.out.println("Invalid order");
        } else {
            switch (joineryType) {
                case "90X130":
                    joineryPrice = 110;
                    if (joineryCount > 60) {
                        joineryPrice -= joineryPrice * 8 / 100;
                    } else if (joineryCount > 30) {
                        joineryPrice -= joineryPrice * 5 / 100;
                    }
                    break;
                case "100X150":
                    joineryPrice = 140;
                    if (joineryCount > 80) {
                        joineryPrice -= joineryPrice * 10 / 100;
                    } else if (joineryCount > 40) {
                        joineryPrice -= joineryPrice * 6 / 100;
                    }
                    break;
                case "130X180":
                    joineryPrice = 190;
                    if (joineryCount > 50) {
                        joineryPrice -= joineryPrice * 12 / 100;
                    } else if (joineryCount > 20) {
                        joineryPrice -= joineryPrice * 7 / 100;
                    }
                    break;
                case "200X300":
                    joineryPrice = 250;
                    if (joineryCount > 50) {
                        joineryPrice -= joineryPrice * 14 / 100;
                    } else if (joineryCount > 25) {
                        joineryPrice -= joineryPrice * 9 / 100;
                    }
                    break;
            }

            if (delivery.equals("With delivery")) {
                deliveryPrice = 60;
            }

            joineryTotalPrice = joineryPrice * joineryCount + deliveryPrice;

            if (joineryCount > 99) {
                joineryTotalPrice -= joineryTotalPrice * 4 / 100;
            }

            System.out.printf("%.2f BGN", joineryTotalPrice);
        }



    }
}
