package exam1;

public abstract class Vehicle {

    //Keep in mind that abstract class
    //represent broad details about an object

    protected String name;
    protected double milesTraveled;

    public Vehicle(String name) {
        this.name = name;
        milesTraveled = 0.0;
    }

    //Create an abstract method axles
//    public abstract int axles();
    public int axles() {
        return 1;
    }

    //Implement a toString() method
    public String toString() {
        return name;
    }

    public void travel(double distance) {
        milesTraveled = milesTraveled + distance;
    }

    public abstract double fuelConsumed();

}
