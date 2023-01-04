package ExamPrep;

import java.util.Scanner;

public class L01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());
        String action = scanner.nextLine();

        while (!action.equals("Generate")) {
            String[] commandArr = action.split(">>>");
            int startIndex = 0;
            int endIndex = 0;

            String substring = "";
            switch (commandArr[0]) {

                case "Contains":
                    substring = commandArr[1];
                    if (activationKey.toString().contains(substring)) {
                        System.out.printf("%s contains %s\n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    startIndex = Integer.parseInt(commandArr[2]);
                    endIndex = Integer.parseInt(commandArr[3]);
                    substring = activationKey.substring(startIndex, endIndex);
                    if (commandArr[1].equals("Upper")) {
                        substring = substring.toUpperCase();
                    } else if (commandArr[1].equals("Lower")) {
                        substring = substring.toLowerCase();
                    }
                    activationKey.replace(startIndex, endIndex, substring);
                    System.out.println(activationKey);
                    break;

                case "Slice":
                    startIndex = Integer.parseInt(commandArr[1]);
                    endIndex = Integer.parseInt(commandArr[2]);
                    activationKey.replace(startIndex, endIndex, "");
                    System.out.println(activationKey);
                    break;
            }

            action = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", activationKey);
    }
}
