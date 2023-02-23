package E01_WorkingWithAbstraction.E02_CardRank;

import java.util.Scanner;

public class Main02 {
    enum CardSuits {
        // елементите от енумерациите се пишат с главни букви (както и всички статични неща)
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    enum CardRank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }

    static <E extends Enum<E>> void printEnumOrdinalsAndName(Enum<E>[] values) {
        for (Enum<E> value : values) {
            System.out.println("Ordinal value: " + value.ordinal() + "; Name value: " + value.name());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        if (command.equals("Card Suits")){
            System.out.println("Card Suits:");
            printEnumOrdinalsAndName(CardSuits.values());
        } else if (command.equals("Card Ranks")){
            System.out.println("Card Ranks:");
            printEnumOrdinalsAndName(CardRank.values());
        }

    }
}
