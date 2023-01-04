package E05_List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class e06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0) {

            int currentCard1 = firstPlayerCards.get(0);
            int currentCard2 = secondPlayerCards.get(0);
            firstPlayerCards.remove(0);
            secondPlayerCards.remove(0);

            if (currentCard1 > currentCard2) {
                firstPlayerCards.add(currentCard1);
                firstPlayerCards.add(currentCard2);
            } else if (currentCard2 > currentCard1) {
                secondPlayerCards.add(currentCard2);
                secondPlayerCards.add(currentCard1);
            }

        }
        int sumCards = 0;
        String winner = "";
        if (firstPlayerCards.size() > 0) {
            winner = "First";
            for (int card : firstPlayerCards) {
                sumCards += card;
            }
        } else {
            winner = "Second";
            for (int card : secondPlayerCards) {
                sumCards += card;
            }
        }


        System.out.printf("%s player wins! Sum: %d", winner, sumCards);


    }
}
