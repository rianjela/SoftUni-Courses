package E08_Generics.E01_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();
            box.add(input);
        }
        System.out.println(box);
    }
}
