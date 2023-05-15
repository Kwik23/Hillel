package src.lesson5;

import src.lesson4.Car;

public class SameName {
    public static void main(String[] args) {
        Employee employee = new Employee("Dmitry", "Engineer", "dmitryhaidai@gmail.com", "+380936745819", 31);
        System.out.println("FullName: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());
    }
}


