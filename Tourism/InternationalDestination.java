package Tourism;

public class InternationalDestination extends Destination {

    String country;
    String visaRequired;

    InternationalDestination(String destinationName,
                             String location,
                             double entryFee,
                             String country,
                             String visaRequired) {

        super(destinationName, location, entryFee);

        this.country = country;
        this.visaRequired = visaRequired;
    }

    void displayInternational() {

        displayDestination();

        System.out.println("Country       : " + country);
        System.out.println("Visa Required : " + visaRequired);
    }
}
