package E04_Methods;

import java.util.Scanner;

public class e05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractTwoDigits(sumTwoDigits(n1, n2), n3));

    }

    public static int sumTwoDigits(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtractTwoDigits(int n1, int n2) {
        return n1 - n2;
    }


}
