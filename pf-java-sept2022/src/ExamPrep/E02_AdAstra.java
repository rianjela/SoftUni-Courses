package ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();


        String regex = "(#|\\|)(?<item>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);

        StringBuilder itemsData = new StringBuilder();
        int totalCalories = 0;

        while (matcher.find()) {

            String currentItem = matcher.group("item");
            String expirationDate = matcher.group("expirationDate");
            int currentCalories = Integer.parseInt(matcher.group("calories"));

            itemsData.append(String.format("Item: %s, Best before: %s, Nutrition: %d\n", currentItem, expirationDate, currentCalories));
            totalCalories += currentCalories;

        }

        int daysWithFood = totalCalories / 2000;

        System.out.printf("You have food to last you for: %d days!\n", daysWithFood);

        if (itemsData.length() > 0) {
            System.out.println(itemsData);
        }


    }
}
