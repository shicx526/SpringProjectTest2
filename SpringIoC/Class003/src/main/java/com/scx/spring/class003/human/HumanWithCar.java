package com.scx.spring.class003.human;

import com.scx.spring.class003.car.Car;

public abstract class HumanWithCar implements Human {

    protected Car car;

    public HumanWithCar(Car car) {
        this.car = car;
    }

    public abstract void goHome();
}
