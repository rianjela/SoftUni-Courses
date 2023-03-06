package E02_Encapsulation.E03_TOFINISHShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> people = parsePeople(scanner.nextLine());
        List<Product> products = parseProducts(scanner.nextLine());

        String action = scanner.nextLine();

        while (!action.equals("END")) {
            String[] personAndProduct = action.split("\\s+");

            Person person = people.stream().filter(p -> p.getName().equals(personAndProduct[0])).findFirst().get();
            Product product = products.stream().filter(p -> p.getName().equals(personAndProduct[1])).findFirst().get();

            action = scanner.nextLine();
        }

        for (Person person : people) {
            List<Product> personProducts = person.getProducts();
            System.out.println((person.getName() + " - "));
            if (personProducts.isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                List<String> productNames = personProducts
                        .stream()
                        .map(Product::getName)
                        .collect(Collectors.toList());
                System.out.println(String.join(" ", productNames));
            }

        }


    }


    private static List<Product> parseProducts(String productsString) {
        List<Product> products = new ArrayList<>();
        String[] productsAsString = productsString.split((";"));
        for (String productAsString : productsAsString) {
            String[]nameAndMoney = productAsString.split("=");

            products.add(new Product((nameAndMoney[0]), Double.parseDouble(nameAndMoney[1])));
        }
        return products;
    }

    private static List<Person> parsePeople(String peopleString) {
        List<Person> people = new ArrayList<>();
        String[] peopleAsString = peopleString.split((";"));
        for (String personAsString : peopleAsString) {
                String[]nameAndMoney = personAsString.split("=");

                people.add(new Person((nameAndMoney[0]), Double.parseDouble(nameAndMoney[1])));
        }
        return people;
    }
}
