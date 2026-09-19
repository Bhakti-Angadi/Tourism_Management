package Tourism;

public class Tourist extends Person{

    String touristId;
    String nationality;

    Tourist(String name, int age, String phone,
            String touristId, String nationality) {

        super(name, age, phone);

        this.touristId = touristId;
        this.nationality = nationality;
    }

    void displayTourist() {

        displayPerson();

        System.out.println("Tourist ID  : " + touristId);
        System.out.println("Nationality : " + nationality);
    }

    
}
