package org.example;

import java.util.UUID;

public class Car {
    UUID Vin;
    int Type;

    public Car(int type){
        Vin = java.util.UUID.randomUUID();
        Type=type;
    }
}
