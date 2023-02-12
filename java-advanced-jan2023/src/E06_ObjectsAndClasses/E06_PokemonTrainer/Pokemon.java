package E06_ObjectsAndClasses.E06_PokemonTrainer;

import java.util.List;

public class Pokemon {
    //. Pokemon has a name, an element, and health

    private String namePokemon;
    private String element;
    private int health;



    //Constructor
    public Pokemon(String namePokemon, String element, int health) {
        this.namePokemon = namePokemon;
        this.element = element;
        this.health = health;
    }

    //Setters & Getters
    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}
