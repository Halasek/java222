package com.company;

public class Car extends Device {
    String producer;
    String model;
    Double millage;
    Double engineSize;
    Integer yearOfProduction;
    String color;


     public Car(String producer, String model, Double millage, Integer yearOfProduction, Double engineSize, String color){
        super("producer", "model", 1992);
    }
    public boolean equals(Car car) {
         if (this == car){
             return true;
         } else if (this.producer.equals(car.producer)
             && this.model.equals(car.model)
             && this.millage.equals(car.millage)) {
            return true;
         } else {
             return false;
        }


    }
}

