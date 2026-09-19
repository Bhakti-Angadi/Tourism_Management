package Tourism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tourist tourist = new Tourist(
                "Bhakti",
                20,
                "9876543210",
                "T101",
                "Indian"
        );

        Guide guide = new Guide(
                "Rahul",
                30,
                "9123456789",
                "G101",
                30000,
                "English",
                "Adventure Tourism"
        );

        Manager manager = new Manager(
                "Priya",
                35,
                "9988776655",
                "M101",
                50000,
                "Tour Operations",
                8
        );

        DomesticDestination domestic =
                new DomesticDestination(
                        "Baga Beach",
                        "Goa",
                        100,
                        "Goa",
                        "November to February"
                );

        InternationalDestination international =
                new InternationalDestination(
                        "Eiffel Tower",
                        "Paris",
                        2000,
                        "France",
                        "Yes"
                );

        HeritageDestination heritage =
                new HeritageDestination(
                        "Hampi",
                        "Karnataka",
                        50,
                        "Karnataka",
                        "October to February",
                        "UNESCO World Heritage",
                        1500
                );

        HotelBooking hotelBooking =
                new HotelBooking(
                        "B101",
                        "19-09-2026",
                        tourist,
                        "Sea View Hotel",
                        1,
                        3
                );

        TourBooking tourBooking =
                new TourBooking(
                        "B102",
                        "20-09-2026",
                        tourist,
                        "Baga Beach",
                        "Rahul",
                        4
                );

        int choice;

        do {

            System.out.println("\n.......................");
            System.out.println("     TOURISM MANAGEMENT SYSTEM");
            System.out.println(".......................\n");
            System.out.println("1. Tourist Details");
            System.out.println("2. Guide Details");
            System.out.println("3. Manager Details");
            System.out.println("4. Domestic Destination");
            System.out.println("5. International Destination");
            System.out.println("6. Heritage Destination");
            System.out.println("7. Hotel Booking");
            System.out.println("8. Tour Booking");
            System.out.println("9. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    tourist.displayTourist();
                    break;

                case 2:
                    guide.displayGuide();
                    break;

                case 3:
                    manager.displayManager();
                    break;

                case 4:
                    domestic.displayDomestic();
                    break;

                case 5:
                    international.displayInternational();
                    break;

                case 6:
                    heritage.displayHeritage();
                    break;

                case 7:
                    hotelBooking.displayHotelBooking();
                    break;

                case 8:
                    tourBooking.displayTourBooking();
                    break;

                case 9:
                    System.out.println(
                            "Thank you for using Tourism Management System!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 9);

        sc.close();
    }
}
