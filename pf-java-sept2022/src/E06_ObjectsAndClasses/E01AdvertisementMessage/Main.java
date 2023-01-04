package E06_ObjectsAndClasses.E01AdvertisementMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> currentAdd = new ArrayList<>();

        String[] phrasesArr = {"Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product." };

        String [] eventsArr = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!" };

        String [] authorsArr = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] citiesArr = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        int numberOfAds = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfAds; i++) {

        Random random = new Random();
        int randomPhrase = random.nextInt(phrasesArr.length);
        int randomEvent = random.nextInt(eventsArr.length);
        int randomAuthor = random.nextInt(authorsArr.length);
        int randomCity = random.nextInt(citiesArr.length);


        //{phrase} {event} {author} – {city}
        System.out.printf("%s %s %s - %s\n", phrasesArr[randomPhrase], eventsArr[randomEvent], authorsArr[randomAuthor], citiesArr[randomCity]);
        }



    }
}
