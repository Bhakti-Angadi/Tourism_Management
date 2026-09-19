package Tourism;

public class Employee extends Person{

    String employeeId;
    double salary;

    Employee(String name, int age, String phone,
             String employeeId, double salary) {

        super(name, age, phone);

        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {

        displayPerson();

        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : ₹" + salary);
    }
}
    

