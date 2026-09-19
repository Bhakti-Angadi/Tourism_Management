package Tourism;

public class HotelBooking extends Booking {

    String hotelName;
    int rooms;
    int nights;

    HotelBooking(String bookingId,
                 String bookingDate,
                 Tourist tourist,
                 String hotelName,
                 int rooms,
                 int nights) {

        super(bookingId, bookingDate, tourist);

        this.hotelName = hotelName;
        this.rooms = rooms;
        this.nights = nights;
    }

    void displayHotelBooking() {

        displayBooking();

        System.out.println("\nHotel Details:");
        System.out.println("Hotel Name : " + hotelName);
        System.out.println("Rooms      : " + rooms);
        System.out.println("Nights     : " + nights);
    }
}