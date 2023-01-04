package L06_ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class l03_BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        BigInteger fact = new BigInteger("1");

        for (int i = 1; i <= number ; i++) {

            fact = fact.multiply(new BigInteger(String.valueOf(i)));

        }

        System.out.println(fact);
    }
}
