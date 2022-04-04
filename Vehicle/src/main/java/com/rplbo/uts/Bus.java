package com.rplbo.uts;

public class Bus extends MotorVehicle {
    private int numPassenger;

    public Bus(Engine engine, Transmision transmision, Tire tire, Wheel wheel) {
        super(engine, tire, wheel, transmision);
    }

    @Override
    public void backward() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void forward() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
