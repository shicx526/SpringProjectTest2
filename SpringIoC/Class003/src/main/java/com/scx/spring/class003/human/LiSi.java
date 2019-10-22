package com.scx.spring.class003.human;

import com.scx.spring.class003.car.Car;

public class LiSi extends HumanWithCar {

    public LiSi(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
