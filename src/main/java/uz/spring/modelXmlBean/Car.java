package uz.spring.modelXmlBean;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int id, String model, String color) {
        System.out.println("I am a car");
        this.id = id;
        this.model = model;
        this.color = color;
    }
}
