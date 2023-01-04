package e06_NestedLoops;

import java.util.Scanner;

public class E06_CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = "";
        String ticketType = "";

        int freeSeats = 0;
        int kids = 0;
        int kidsAll = 0;
        int students = 0;
        int studentsAll = 0;
        int standard = 0;
        int standardAll = 0;
        int ticketsSoldPerMovie = 0;
        int allTicketsSold = 0;

        String input = scanner.nextLine();

        while (!input.equals("Finish")) {

            movie = input;
            freeSeats = Integer.parseInt(scanner.nextLine());
            ticketType = scanner.nextLine();


            while (!ticketType.equals("End")) {


                switch (ticketType) {
                    case "student":
                        students++;
                        studentsAll++;
                        break;
                    case "standard":
                        standard++;
                        standardAll++;
                        break;
                    case "kid":
                        kids++;
                        kidsAll++;
                        break;
                }

                ticketsSoldPerMovie = kids + standard + students;
                allTicketsSold = standardAll + kidsAll + studentsAll;

                if (ticketsSoldPerMovie == freeSeats) {
                    break;
                }


                ticketType = scanner.nextLine();
            }

            System.out.printf("%s - %.2f%% full.\n", movie, 1.0 * ticketsSoldPerMovie / freeSeats * 100);

            kids = 0;
            standard = 0;
            students = 0;
            ticketsSoldPerMovie = 0;

            input = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d\n", allTicketsSold);
        System.out.printf("%.2f%% student tickets.\n", 1.0 * studentsAll / allTicketsSold * 100);
        System.out.printf("%.2f%% standard tickets.\n", 1.0 * standardAll / allTicketsSold * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * kidsAll / allTicketsSold * 100);


    }
}

