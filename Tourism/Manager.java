package Tourism;

public class Manager extends Employee {

    String department;
    int experience;

    Manager(String name, int age, String phone,
            String employeeId, double salary,
            String department, int experience) {

        super(name, age, phone, employeeId, salary);

        this.department = department;
        this.experience = experience;
    }

    void displayManager() {

        displayEmployee();

        System.out.println("Department  : " + department);
        System.out.println("Experience  : " + experience + " years");
    }
}
