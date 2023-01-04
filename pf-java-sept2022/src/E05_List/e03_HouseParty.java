package E05_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class e03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        List<String> partyPeopleList = new ArrayList<>();

        for (int i = 0; i < guestsCount; i++) {

            String[] goingOrNotArr = scanner.nextLine().split(" ");

            if (goingOrNotArr.length == 3) {

                if (!partyPeopleList.contains(goingOrNotArr[0])) {
                    partyPeopleList.add(goingOrNotArr[0]);
                } else {
                    System.out.printf("%s is already in the list!\n", goingOrNotArr[0]);
                }

            } else {

                if (partyPeopleList.contains(goingOrNotArr[0])) {
                    partyPeopleList.remove(String.valueOf(goingOrNotArr[0]));
                } else {
                    System.out.printf("%s is not in the list!\n", goingOrNotArr[0]);

                }
            }
        }
        System.out.println(String.join("\n", partyPeopleList));

    }
}

