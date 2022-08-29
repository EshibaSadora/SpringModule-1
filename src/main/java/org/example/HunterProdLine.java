package org.example;

public class HunterProdLine implements ProductionLine{
    @Override
    public Car build() {
        Car car = new Car(1);
        System.out.println("Уаз хантер построен");
        return car;

    }
}
