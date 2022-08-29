package org.example;

public class PatriotProdLine implements ProductionLine{
    @Override
    public Car build() {
        Car car = new Car(2);
        System.out.println("Уаз патриот построен");
        return car;
    }
}
