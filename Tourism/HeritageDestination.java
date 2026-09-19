package Tourism;

public class HeritageDestination extends DomesticDestination {

    String heritageType;
    int yearBuilt;

    HeritageDestination(String destinationName,
                        String location,
                        double entryFee,
                        String state,
                        String bestSeason,
                        String heritageType,
                        int yearBuilt) {

        super(destinationName, location,
              entryFee, state, bestSeason);

        this.heritageType = heritageType;
        this.yearBuilt = yearBuilt;
    }

    void displayHeritage() {

        displayDomestic();

        System.out.println("Heritage Type : " + heritageType);
        System.out.println("Year Built    : " + yearBuilt);
    }
}
