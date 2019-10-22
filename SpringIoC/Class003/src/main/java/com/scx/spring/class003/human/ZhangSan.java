package com.scx.spring.class003.human;

import com.scx.spring.class003.car.Car;

public class ZhangSan extends HumanWithCar{
    public ZhangSan(Car car) {
        super(car);
    }

    public void goHome() {
        car.start();
        car.stop();
    }
}
