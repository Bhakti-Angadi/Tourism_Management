package Tourism;

public class Booking {

    String bookingId;
    String bookingDate;
    Tourist tourist;

    Booking(String bookingId,
            String bookingDate,
            Tourist tourist) {

        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.tourist = tourist;
    }

    void displayBooking() {

        System.out.println("Booking ID   : " + bookingId);
        System.out.println("Booking Date : " + bookingDate);

        System.out.println("\nTourist Details:");

        tourist.displayTourist();
    }
}
