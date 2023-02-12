package E06_ObjectsAndClasses.E06_PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("\\s+");
        Map<String, Trainer> trainersBadgesMap = new LinkedHashMap<>();
        Map<String, List<Pokemon>> trainersPokemonMap = new LinkedHashMap<>();

        while (!info[0].equals("Tournament")) {
            //TODO: filling the POKEMON and Trainer lists
            String trainerName = info[0];
            String pokemonName = info[1];
            String pokemonElement = info[2];
            int pokemonHealth = Integer.parseInt(info[3]);

            // Trainer Badges
            trainersBadgesMap.putIfAbsent(trainerName, new Trainer(trainerName, 0)); // добавяме трейнър, ако го няма

            // Pokemons
            trainersPokemonMap.putIfAbsent(trainerName, new ArrayList<>());
            List<Pokemon> currentPokemonList = trainersPokemonMap.get(trainerName);
            currentPokemonList.add(new Pokemon(pokemonName, pokemonElement, pokemonHealth));
//            trainersBadgesMap.get(trainerName).getPokemonCollection().add(new Pokemon(pokemonName, pokemonElement, pokemonHealth));

            info = scanner.nextLine().split("\\s+");
        }

        String element = scanner.nextLine();
        while (!element.equals("End")) {
            for (Map.Entry<String, List<Pokemon>> trainer : trainersPokemonMap.entrySet()) {
                String currentTrainer = trainer.getKey();
                List<Pokemon> pokemonsOfCurrentTrainer = trainer.getValue();

                // if element is a match
                if (isMatchingElement(pokemonsOfCurrentTrainer, element)) {
                    int currentBadges = trainersBadgesMap.get(currentTrainer).getBadgesNumber() + 1;
                    trainersBadgesMap.get(currentTrainer).setBadgesNumber(currentBadges);
                } else {
                    trainer.getValue().removeIf(pokemon -> {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                        return pokemon.getHealth() <= 0;
                    });
                }
            }


            element = scanner.nextLine();
        }

        Map<String, Trainer> sortedBadges = sortByBadges(trainersBadgesMap);

        printTrainersInfo(trainersPokemonMap, sortedBadges);


    }

    // print
    private static void printTrainersInfo(Map<String, List<Pokemon>> trainersPokemonMap, Map<String, Trainer> sortedBadges) {
        for (Map.Entry<String, Trainer> traner : sortedBadges.entrySet()) {
            String currentName = traner.getKey();
            int badgesCount = traner.getValue().getBadgesNumber();
            int pokemonCount = trainersPokemonMap.get(currentName).size();
            System.out.printf("%s %d %d%n", currentName, badgesCount, pokemonCount);
        }
    }

    // sorting map by value inside of class
    private static Map<String, Trainer> sortByBadges(Map<String, Trainer> map) {
        List<Map.Entry<String, Trainer>> listOfBadges = new LinkedList<>(map.entrySet());
        Collections.sort(listOfBadges, (l1, l2) -> {
            int first = l1.getValue().getBadgesNumber();
            int second = l2.getValue().getBadgesNumber();
            if (first > second) {
                return -1;
            } else {
                return +1;
            }
        });
        LinkedHashMap<String, Trainer> result = new LinkedHashMap();

        for (Map.Entry<String, Trainer> badge : listOfBadges) {
            result.put(badge.getKey(), badge.getValue());
        }

        return result;
    }

    //check if element is matching pokemon element
    private static boolean isMatchingElement(List<Pokemon> pokemons, String element) {
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }


}
