package E09_IteratorsAndComparators.E04_Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Lake lake = new Lake(reader.readLine());

        String input = reader.readLine();

        if (input.equals("END")) {
            lake.jump();
        }
    }
}
