package Tourism;

public class DomesticDestination extends Destination {

    String state;
    String bestSeason;

    DomesticDestination(String destinationName,
                        String location,
                        double entryFee,
                        String state,
                        String bestSeason) {

        super(destinationName, location, entryFee);

        this.state = state;
        this.bestSeason = bestSeason;
    }

    void displayDomestic() {

        displayDestination();

        System.out.println("State       : " + state);
        System.out.println("Best Season : " + bestSeason);
    }
}
