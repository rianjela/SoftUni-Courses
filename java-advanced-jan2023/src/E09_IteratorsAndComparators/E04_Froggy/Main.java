package E09_IteratorsAndComparators.E04_Froggy;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Lake lake = new Lake(input);

        while (!input.equals("END")) {
            lake = new Lake(input);
            input = scanner.nextLine();
        }
        lake.jump();

//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Lake lake = new Lake(reader.readLine());
//
//        String input = reader.readLine();
//
//        if (input.equals("END")) {
//            lake.jump();
//        }
    }
}
