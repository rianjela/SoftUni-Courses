package E03_SetsAndMapsAdv;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbersData = scanner.nextLine().split("-");
        Map<String, String> phoneBook = new TreeMap<>();


        while (!phoneNumbersData[0].equals("search")){

            String name = phoneNumbersData[0];
            String phone = phoneNumbersData[1];
            phoneBook.put(name, phone);

            phoneNumbersData = scanner.nextLine().split("-");
        }

        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")){
            if (phoneBook.containsKey(searchName)){
                System.out.printf("%s -> %s%n", searchName, phoneBook.get(searchName));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }
            searchName = scanner.nextLine();
        }
    }
}
