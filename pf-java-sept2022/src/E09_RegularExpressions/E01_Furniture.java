package E09_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String purchasedData = scanner.nextLine();

        String regex = ">{2}(?<furniture>[A-Za-z]+)<{2}(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        double totalMoneySpent = 0;

        System.out.println("Bought furniture:");

        while (!purchasedData.equals("Purchase")) {
            Matcher matcher = pattern.matcher(purchasedData);

            if (matcher.find()) {
                System.out.println(matcher.group("furniture"));
                double priceCurrent = Double.parseDouble(matcher.group("price"));
                int quantityCurrent = Integer.parseInt(matcher.group("quantity"));
                totalMoneySpent += priceCurrent * quantityCurrent;
            }

            purchasedData = scanner.nextLine();

        }

        System.out.printf("Total money spend: %.2f", totalMoneySpent);


    }
}
