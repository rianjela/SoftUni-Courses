package ExamMiddle_PF2022;

import java.util.Scanner;

public class em02_FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friendsNamesArr = scanner.nextLine().split(",\\s+");
        String[] commandArr = scanner.nextLine().split("\\s+");
        int blacklistedNamesCount = 0;
        int lostNamesCount = 0;

        while (!commandArr[0].equals("Report")) {


            switch (commandArr[0]) {
                case "Blacklist":
                    String nameToBlacklist = commandArr[1];
                    boolean nameFound = false;
                    for (int i = 0; i < friendsNamesArr.length; i++) {
                        if (friendsNamesArr[i].equals(nameToBlacklist)) {
                            System.out.printf("%s was blacklisted.\n", friendsNamesArr[i]);
                            friendsNamesArr[i] = "Blacklisted";
                            blacklistedNamesCount++;
                            nameFound = true;
                            break;
                        }
                    }
                    if (!nameFound) {
                        System.out.println(nameToBlacklist + " was not found.");
                    }

                    break;
                case "Error":
                    int indexError = Integer.parseInt(commandArr[1]);
                    if (indexError >= 0 && indexError < friendsNamesArr.length) {
                        String nameToLoose = friendsNamesArr[indexError];
                        if (!nameToLoose.equals("Blacklisted") && !nameToLoose.equals("Lost")) {
                            System.out.printf("%s was lost due to an error.\n", friendsNamesArr[indexError]);
                            friendsNamesArr[indexError] = "Lost";
                            lostNamesCount++;
                            break;
                        }
                    }
                    break;

                case "Change":
                    int indexChange = Integer.parseInt(commandArr[1]);
                    String newName = commandArr[2];

                    if (indexChange >= 0 && indexChange < friendsNamesArr.length) {
                        System.out.printf("%s changed his username to %s.\n", friendsNamesArr[indexChange], newName);
                        friendsNamesArr[indexChange] = newName;
                    }

                    break;

            }

            commandArr = scanner.nextLine().split("\\s+");
        }

        System.out.println("Blacklisted names: " + blacklistedNamesCount);
        System.out.println("Lost names: " + lostNamesCount);

        System.out.println(String.join(" ", friendsNamesArr));
    }
}
