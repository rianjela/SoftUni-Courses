package E06_ObjectsAndClasses.E07_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] infoPerson = scanner.nextLine().split("\\s+");
        Map<String, Person> peopleData = new LinkedHashMap<>();

        while (!infoPerson[0].equals("End")) {

            // пълним мап-а
            String personName = infoPerson[0];
            String infoType = infoPerson[1];
            peopleData.putIfAbsent(personName, new Person());
            switch (infoType) {
                case "company":
                    //{Name} company {companyName} {department} {salary}
                    Company currentCompany = new Company(infoPerson[2], infoPerson[3], Double.parseDouble(infoPerson[4]));
                    peopleData.get(personName).setCompany(currentCompany);
                    break;
                case "pokemon":
                    //•	"{Name} pokemon {pokemonName} {pokemonType}"
                    Pokemon currentPokemon = new Pokemon(infoPerson[2], infoPerson[3]);
                    peopleData.get(personName).getPokemons().add(currentPokemon);
                    break;
                case "parents":
                    //•	"{Name} parents {parentName} {parentBirthday}"
                    Parent currentParent = new Parent(infoPerson[2], infoPerson[3]);
                    peopleData.get(personName).getParents().add(currentParent);
                    break;
                case "children":
                    //•	"{Name} children {childName} {childBirthday}"
                    Child currentChild = new Child(infoPerson[2], infoPerson[3]);
                    peopleData.get(personName).getChildren().add(currentChild);
                    break;
                case "car":
                    //•	"{Name} car {carModel} {carSpeed}"
                    Car currentCar = new Car(infoPerson[2], Integer.parseInt(infoPerson[3]));
                    peopleData.get(personName).setCar(currentCar);
                    break;

            }

            infoPerson = scanner.nextLine().split("\\s+");
        }

        String requestedPerson = scanner.nextLine();

        System.out.println(requestedPerson);
        System.out.print(peopleData.get(requestedPerson));
    }


}
