package com.company;

public abstract class Phone extends Device {
    String model;
    String producer;
    Integer yearOfProduction;
    String os;
    Double screensize;

    public Phone(String producer, String model, Double screensize, Integer yearOfProduction, String os) {
        super("producer", "model", 2001);
    }

    public boolean equals(Phone phone) {
        if (this == phone) {
            return true;
        } else if (this.producer.equals(phone.producer)
                && this.model.equals(phone.model)
                && this.os.equals(phone.os)) {
            return true;
        } else {
            return false;
        }
    }
        public void turnOn(){
            System.out.println("Włączam telefon");
        }
    }



