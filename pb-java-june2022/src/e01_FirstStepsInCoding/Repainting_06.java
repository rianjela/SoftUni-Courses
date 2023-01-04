package e01_FirstStepsInCoding;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double price = (nylon+2) * 1.50 + (paint + paint*10/100.00) * 14.5 + thinner * 5 + 0.4;
        double priceWorkers = workHours * price * 30/100;

        price = price + priceWorkers;

        System.out.println(price);


    }
}
