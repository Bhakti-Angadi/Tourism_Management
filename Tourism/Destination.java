package Tourism;

public  class Destination {

    String destinationName;
    String location;
    double entryFee;

    Destination(String destinationName,
                String location,
                double entryFee) {

        this.destinationName = destinationName;
        this.location = location;
        this.entryFee = entryFee;
    }

    void displayDestination() {

        System.out.println("Destination : " + destinationName);
        System.out.println("Location    : " + location);
        System.out.println("Entry Fee   : ₹" + entryFee);
    }
}