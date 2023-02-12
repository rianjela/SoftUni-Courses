package E06_ObjectsAndClasses.E07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    //•	"{Name} company {companyName} {department} {salary}"
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;
    private Car car;

    // Constructor
    public Person() {
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person(String name, Company company, Car car, List<Pokemon>pokemons, List<Parent>parents, List<Child>children) {
        this.name = name;
        this.car = car;
        this.company = company;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }


    //Override toString


    @Override
    public String toString() {
        StringBuilder print = new StringBuilder();

        print.append("Company:\n");
        if (company != null) {
            print.append(company);
        }
        print.append("Car:\n");
        if (car != null) {
            print.append(car);
        }
        print.append("Pokemon:\n");
        for (Pokemon pokemon : pokemons) {
            print.append(pokemon);
        }
        print.append("Parents:\n");
        for (Parent parent : parents) {
            print.append(parent);
        }
        print.append("Children:\n");
        for (Child child : children) {
            print.append(child);
        }

        return print.toString();
    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
