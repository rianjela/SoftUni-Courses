package ExamPrep;

import java.util.Scanner;

public class E01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String[] action = scanner.nextLine().split(" ");

        while (!action[0].equals("Done")) {

            switch (action[0]) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if (i % 2 != 0) {
                            char currentChar = password.charAt(i);
                            newPassword.append(currentChar);
                        }
                    }
                    password = newPassword;
                    System.out.println(password.toString());
                    break;
                case "Cut":

                    int index = Integer.parseInt(action[1]);
                    int length = Integer.parseInt(action[2]);

                    String substringToRemove = password.substring(index, index + length);
                    password = new StringBuilder(password.toString().replaceFirst(substringToRemove, ""));

//                    newPassword.replace(index, index + length, "");
                    System.out.println(password.toString());
                    break;
                case "Substitute":
                    if (password.length() <= 0) {
                        password = new StringBuilder(password);
                    }
                    String substring = action[1];
                    String substitute = action[2];

                    if (!password.toString().contains(substring)) {
                        System.out.println("Nothing to replace!");
                    } else {
                        while (password.toString().contains(substring)) {
                            int indexSubstring = password.indexOf(substring);
                            password.replace(indexSubstring, indexSubstring + substring.length(), "");
                            password.insert(indexSubstring, substitute);

                            substring = action[1];
                        }

                        System.out.println(password.toString());

                        break;
                    }
            }


            action = scanner.nextLine().split(" ");
        }

        System.out.printf("Your password is: %s", password.toString());
    }
}
