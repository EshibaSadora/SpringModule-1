package org.example;

import java.util.UUID;

public class Car {

    //это уникальный номер автомобиля (добавил, потому что захотел)
    UUID Vin;

    //Тип построенного автомобиля, что бы модели различать
    int Type;

    public Car(int type){
        Vin = java.util.UUID.randomUUID();
        Type=type;
    }
}
