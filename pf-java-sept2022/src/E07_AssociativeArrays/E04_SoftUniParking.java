package E07_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class E04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> registeredUsers = new LinkedHashMap<>();


        for (int i = 0; i < countCommands; i++) {
            String[] commandArr = scanner.nextLine().split("\\s+");
            String user = commandArr[1];
            switch (commandArr[0]) {
                case "register":
                    String licensePlate = commandArr[2];
                    if (!registeredUsers.containsKey(user)) {
                        registeredUsers.put(user, licensePlate);
                        System.out.printf("%s registered %s successfully\n", user, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s\n", registeredUsers.get(user));
                    }
                    break;
                case "unregister":
                    if (!registeredUsers.containsKey(user)) {
                        System.out.printf("ERROR: user %s not found\n", user);
                    } else {
                        System.out.printf("%s unregistered successfully\n", user);
                        registeredUsers.remove(user);
                    }
                    break;
            }

        }

        registeredUsers.entrySet().forEach(entry -> System.out.printf("%s => %s\n", entry.getKey(), entry.getValue()));
    }
}
