package pattern.build.diffialdExample;

/**
 *  Pattern Builder
 */

public class builder {
    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.BuildCar();
        System.out.println(car);
    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    private String make = "Default";
    private Transmission transmission = Transmission.MANUAL;
    private int maxSpeed = 120;

    public void setMake(String m) {
        this.make = m;
    }

    public void setTransmission(Transmission t) {
        this.transmission = t;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return make + " " + transmission + " " + maxSpeed;
    }
}


abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void builderMake();

    abstract void builderTransmission();

    abstract void builderMaxSpeed();

    Car getCar() {
        return car;
    }
}

class FordMondeoBuilder extends CarBuilder {

    void builderMake() {
        car.setMake("Ford Mondeo");
    }

    void builderTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void builderMaxSpeed() {
        car.setMaxSpeed(220);
    }

}

class SubaruBuilder extends CarBuilder {

    void builderMake() {
        car.setMake("Subaru");
    }

    void builderTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void builderMaxSpeed() {
        car.setMaxSpeed(280);
    }
}

class Director {
    private CarBuilder builder;

    void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car BuildCar() {
        builder.createCar();
        builder.builderMake();
        builder.builderTransmission();
        builder.builderMaxSpeed();
        return builder.getCar();
    }
}

