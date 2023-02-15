package E08_Generics.E02_GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Box<Integer> box = new Box<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            box.add(Integer.parseInt(input));
        }
        System.out.println(box);
    }
}
