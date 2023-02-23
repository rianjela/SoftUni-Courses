package E01_WorkingWithAbstraction.E01_CardSuit;

import java.util.Scanner;

public class Main {

    enum CardSuits {
        // елементите от енумерациите се пишат с главни букви (както и всички статични неща)
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    public static void main(String[] args) {

        System.out.println("Card Suits:");
        CardSuits[] values = CardSuits.values();
        for (CardSuits value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }
    }


}
