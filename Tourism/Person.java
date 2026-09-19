package Tourism;

public class Person {
    String name;
    int age;
    String phone;

    Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    void displayPerson() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Phone : " + phone);
    }
}
