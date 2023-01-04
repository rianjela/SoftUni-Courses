package E09_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\%(?<customer>[A-Z][a-z]*)\\%([^\\|\\$\\%\\.]*)*?\\<(?<product>\\w+)\\>([^\\|\\$\\%\\.]*)*?\\|(?<quantity>\\d*)\\|([^\\|\\$\\%\\.]*)*?(?<price>\\d+.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double totalPrice = 0;
        double income = 0;

        String input = scanner.nextLine();
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

           while (matcher.find()) {
                String customerName = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                totalPrice = count * price;
                System.out.printf("%s: %s - %.2f\n", customerName, product, totalPrice);
                income += totalPrice;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }
}
