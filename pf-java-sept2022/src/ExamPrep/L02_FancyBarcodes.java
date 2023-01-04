package ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBarcodes = Integer.parseInt(scanner.nextLine());
        String regexValidation = "@#+[A-Z][A-Za-z\\d]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regexValidation);

        for (int i = 0; i < countBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            StringBuilder productGroup = new StringBuilder();
            if (matcher.find()) {
                for (char character : barcode.toCharArray()) {
                    if (Character.isDigit(character)){
                        productGroup.append(character);
                    }
                }

            if (productGroup.length()>0){
                System.out.printf("Product group: %s\n", productGroup);
            } else {
                System.out.println("Product group: 00");
            }

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
