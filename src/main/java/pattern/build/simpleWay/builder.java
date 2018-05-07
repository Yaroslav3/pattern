package pattern.build.simpleWay;

/**
 * Pattern Builder
 */


public class builder {
    public static void main(String[] args) {
        Car car = new CarBuilder().
                builderMake("Mercedes")
                .builderTransmission(Transmission.AUTO)
                .builderMaxSpeed(250)
                .build();
//        Car car = new Car();
        System.out.println(car);

    }
}

enum Transmission {
    MANUAL, AUTO
}

class Car {
    String make = "Default";
    Transmission transmission = Transmission.MANUAL;
    int maxSpeed = 120;

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

class CarBuilder {
    String m;
    Transmission t;
    int s;

    CarBuilder builderMake(String m) {
        this.m = m;
        return this;
    }

    CarBuilder builderTransmission(Transmission transmission) {
        this.t = transmission;
        return this;
    }

    CarBuilder builderMaxSpeed(int speed) {
        this.s = speed;
        return this;
    }

    Car build() {
        Car car = new Car();
        car.setMake(m);
        car.setTransmission(t);
        car.setMaxSpeed(s);
        return car;
    }
}
