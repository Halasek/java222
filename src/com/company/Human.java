package com.company;

public class Human extends Animal {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    public Car car;
    public Double cash;

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
    public Car getCar(){
        return this.car;
    }
}
