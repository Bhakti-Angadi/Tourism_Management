package Tourism;

public class TourBooking extends Booking {

    String destination;
    String guideName;
    int numberOfPeople;

    TourBooking(String bookingId,
                String bookingDate,
                Tourist tourist,
                String destination,
                String guideName,
                int numberOfPeople) {

        super(bookingId, bookingDate, tourist);

        this.destination = destination;
        this.guideName = guideName;
        this.numberOfPeople = numberOfPeople;
    }

    void displayTourBooking() {

        displayBooking();

        System.out.println("\nTour Details:");
        System.out.println("Destination     : " + destination);
        System.out.println("Guide Name      : " + guideName);
        System.out.println("Number of People: " + numberOfPeople);
    }
}
