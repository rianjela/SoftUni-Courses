package E03_SetsAndMapsAdv;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        Map<String, String> emailSet = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            //TODO: check if email.equals("stop)
            String email = scanner.nextLine();

            //"us", "uk," or "com"
            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emailSet.put(name, email);
            }
            name = scanner.nextLine();
        }

        emailSet.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));

    }
}
