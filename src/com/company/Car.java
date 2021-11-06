package com.company;

public  class Car extends Device implements Saleable {
    String producer;
    String model;
    Double millage;
    Double engineSize;
    Integer yearOfProduction;
    String color;


    public Car(String producer, String model, Double millage, Integer yearOfProduction, Double engineSize, String color) {
        super("producer", "model", 1992);
    }

    public boolean equals(Car car) {
        if (this == car) {
            return true;
        } else if (this.producer.equals(car.producer)
                && this.model.equals(car.model)
                && this.millage.equals(car.millage)) {
            return true;
        } else {
            return false;
        }
    }

    public void turnOn() {
        System.out.println("przekręcam kluczyk");

    }

    public void sale(Human seller, Human buyer, Double price) {
        if (buyer.cash >= price) {
            System.out.println("Nie masz kasy, nara");
        } else if (seller.getCar() == null) {
            System.out.println("Sprzedający nie ma żadnego auta");
        } else if (!seller.getCar().equals(this)) {
            System.out.println("Sprzedający nie ma tego konkretnego samochodu");
        } else if() {
        }
    }
}


