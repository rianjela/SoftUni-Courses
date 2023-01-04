package E03_Arrays;

import java.util.Scanner;

public class e02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstLine = scanner.nextLine().split(" ");
        String [] secondLine = scanner.nextLine().split(" ");

        for (String first:secondLine) {
            for (String second: firstLine) {
                    if (second.equals(first)){
                        System.out.printf("%s ", second);
                    }
            }
        }

    }
}

