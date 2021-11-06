package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;

    Human() {
        super("homo sapiens");
        this.salary = 1200.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    Double getSalary() {
        System.out.println("wynagrodzenie: " + this.salary);
        return this.salary;
    }
}
