package Tourism;

public class Guide extends Employee{

    String language;
    String specialization;

    Guide(String name, int age, String phone,
          String employeeId, double salary,
          String language, String specialization) {

        super(name, age, phone, employeeId, salary);

        this.language = language;
        this.specialization = specialization;
    }

    void displayGuide() {

        displayEmployee();

        System.out.println("Language        : " + language);
        System.out.println("Specialization  : " + specialization);
    }
}
    

