package lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone= phone_number;
        this.salary = salary;
        this.age = age;
    }
    void printInfo() {
        System.out.printf("Сотрудник: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n%n", name, position, email, phone, salary, age);
    }
}
