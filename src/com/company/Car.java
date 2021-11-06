package com.company;

public class Car extends Device {
    String producer;
    String model;
    Double millage;
    Double engineSize;
    Integer yearOfProduction;
    String color;


     public Car(String producer, String model, Double millage, Integer yearOfProduction){
        super(producer, model, yearOfProduction);
        this.millage = millage;
    }
    public boolean equals(Car car) {
         if (this == car){
             return true;
         } else if (this.producer.equals(car.producer)
             && this.model.equals(car.model)
             && this.millage.equals((car.millage)){
            return true;
         }


    }
}

