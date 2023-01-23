package E03_SetsAndMapsAdv;

import java.util.*;

public class E07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        // Мап за съхранение на сумата
        Map<String, Set<String>> playersDecksMap = new LinkedHashMap<>();
        Map<String, Integer> PTMap = new LinkedHashMap<>();

        while (!inputData.equals("JOKER")) {

            //"{personName}: {PT, PT, PT,… PT}"
            //Peter: 2C, 4H, 9H, AS, QS
            String currentPlayer = inputData.split(": ")[0]; //"Peter"
            String[] currentDeck = inputData.split(": ")[1].split(",\\s+"); //"2C, 4H, 9H, AS, QS"

            List<String> list = new ArrayList<>();
            for (String s : currentDeck) {
                list.add(s);
            }
            Set<String> currentDeckSet = new LinkedHashSet<>(list);
            playersDecksMap.putIfAbsent(currentPlayer, new LinkedHashSet<>()); // playersDecksMap <Peter, >
            playersDecksMap.get(currentPlayer).addAll(currentDeckSet); // add "2C, 4H, 9H, AS, QS" to set

            inputData = scanner.nextLine();
        }
            for (Map.Entry<String, Set<String>> player : playersDecksMap.entrySet()) {
                int PT = getPTValue(playersDecksMap.get(player.getKey()));
                PTMap.putIfAbsent(player.getKey(), 0);
                PTMap.put(player.getKey(), PTMap.get(player.getKey()) + PT);
            }

        PTMap.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }

    //Set: 6H, 7S, KC, KD, 5S, 10C
    private static int getPTValue(Set<String> deck) {
        int cardsSum = 0;
        for (String card : deck) { //6H
            int power = 0;
            String typeLetter = "";
            int typeValue = 0;

            if (card.length() == 3) { // при "10C"
                power = 10;
                typeLetter = "" + card.toCharArray()[2];
            } else {
                char powerSymbol = card.toCharArray()[0];
                power = getPowerValue(powerSymbol);
                typeLetter = "" + card.toCharArray()[1];
            }
            typeValue = getTypeValue(typeLetter);

            cardsSum += power * typeValue;
        }

        return cardsSum;
    }

    private static int getTypeValue(String typeLetter) {
        //S -> 4, H-> 3, D -> 2, C -> 1
        int type = 0;
        switch (typeLetter) {
            case "S":
                type = 4;
                break;
            case "H":
                type = 3;
                break;
            case "D":
                type = 2;
                break;
            case "C":
                type = 1;
                break;
        }
        return type;
    }

    private static int getPowerValue(char powerSymbol) {
        //2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
        int power = 0;
        if (powerSymbol >= '2' && powerSymbol <= '9') {
            power = Integer.parseInt(Character.toString(powerSymbol));
        } else {
            switch (powerSymbol) {
                case 'J':
                    power = 11;
                    break;
                case 'Q':
                    power = 12;
                    break;
                case 'K':
                    power = 13;
                    break;
                case 'A':
                    power = 14;
                    break;
            }
        }
        return power;
    }


}
