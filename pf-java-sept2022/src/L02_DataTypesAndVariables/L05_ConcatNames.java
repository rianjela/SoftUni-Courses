package L02_DataTypesAndVariables;

import java.util.Scanner;

public class L05_ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String sign = scanner.nextLine();

        System.out.printf("%s%s%s", name1,sign, name2);
    }
}
