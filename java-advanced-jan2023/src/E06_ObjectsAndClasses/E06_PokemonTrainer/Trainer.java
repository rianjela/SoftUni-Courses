package E06_ObjectsAndClasses.E06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //The trainer has a name, a number of badges, and a collection of pokemon. Every Trainer starts with 0 badges.

    private String nameTrainer;
    private int badgesNumber;
//    private List<Pokemon> pokemonCollection;


    // Constructor
    public Trainer(String nameTrainer, int badgesNumber) {//, List<Pokemon> pokemonCollection
        this.nameTrainer = nameTrainer;
        this.badgesNumber = 0;
       // this.pokemonCollection = new ArrayList<>();
    }


    //Getters & Setters
    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public int getBadgesNumber() {
        return badgesNumber;
    }

    public void setBadgesNumber(int badgesNumber) {
        this.badgesNumber = badgesNumber;
    }

//    public List<Pokemon> getPokemonCollection() {
//        return pokemonCollection;
//    }
//
//    public void setPokemonCollection(List<Pokemon> pokemonCollection) {
//        this.pokemonCollection = pokemonCollection;
//    }

}
