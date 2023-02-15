package E08_Generics.E04_GenericSwapMethodInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.add(Integer.parseInt(input));
        }

        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        box.swap(firstIndex, secondIndex);

        System.out.println(box);
    }
}
