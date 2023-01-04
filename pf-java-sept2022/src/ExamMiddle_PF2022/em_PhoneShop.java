package ExamMiddle_PF2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class em_PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phoneModelsList = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" - ");

        while (!command[0].equals("End")) {

            switch (command[0]) {
                case "Add":
                    String addPhone = command[1];

                    if (!containsModel(phoneModelsList, addPhone)) {
                        phoneModelsList.add(addPhone);
                    }
                    break;

                case "Remove":
                    String removePhone = command[1];

                    for (int i = 0; i < phoneModelsList.size(); i++) {
                        if (removePhone.equals(phoneModelsList.get(i))) {
                            phoneModelsList.remove(i);
                            i = -1;
                        }
                    }
                    break;

                case "Bonus phone":
                    String[] bonusPhones = command[1].split(":");
                    String oldPhone = bonusPhones[0];
                    String newPhone = bonusPhones[1];

                    if (containsModel(phoneModelsList, oldPhone)) {
                        int indexOld = phoneModelsList.indexOf(oldPhone);
                        phoneModelsList.add(indexOld + 1, newPhone);
                    }

                    break;

                case "Last":
                    String lastPhone = command[1];

                    if (containsModel(phoneModelsList, lastPhone)) {
                        phoneModelsList.remove(String.valueOf(lastPhone));
                        phoneModelsList.add(lastPhone);
                    }

                    break;
            }

            command = scanner.nextLine().split(" - ");
        }

        for (int i = 0; i < phoneModelsList.size(); i++) {
            if (i == phoneModelsList.size() - 1) {
                System.out.print(phoneModelsList.get(i));
            } else {
                System.out.print(phoneModelsList.get(i) + ", ");
            }
        }

    }

    public static boolean containsModel(List<String> list, String phoneModel) {
        boolean containsPhone = false;

        for (String phone : list) {
            if (phone.equals(phoneModel)) {
                containsPhone = true;
                break;
            }
        }
        return containsPhone;
    }
}
