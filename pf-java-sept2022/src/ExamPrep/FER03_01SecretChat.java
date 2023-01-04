package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FER03_01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String[] action = scanner.nextLine().split(":\\|:");

        while (!action[0].equals("Reveal")) {

            switch (action[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(action[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substringToReverse = Pattern.quote(action[1]);
                    System.out.println(substringToReverse);
                    String reversedSubstring = new StringBuilder(substringToReverse).reverse().toString();

                    if (!message.toString().contains(substringToReverse)) {
                        System.out.println("error");
                    } else {
                        String removedSubInput = message.toString().replaceFirst(substringToReverse, "");

                        message = new StringBuilder(removedSubInput).append(reversedSubstring);
                    }
                    System.out.println(message);
                    break;
                case "ChangeAll":
                    String substringToChange = action[1];
                    String replacement = action[2];

                    message = new StringBuilder(message.toString().replaceAll(substringToChange, replacement));
                    System.out.println(message);
                    break;
            }


            action = scanner.nextLine().split(":\\|:");
        }

        System.out.printf("You have a new text message: %s", message);
    }

}
