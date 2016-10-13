
package exam1;

public class MotorVehicle extends Vehicle {

    protected double estimatedGalPerMile;
    protected String kindOfFuel;
    private double estimatedGPM;

    public MotorVehicle(String name, double estmatedGPM, String fuel) {
        super(name);

        estimatedGalPerMile = estimatedGPM;
        kindOfFuel = fuel;
    }

    public String toString() {
        return super.toString() + ": motor vehicle";
    }

    public double fuelConsumed() {
        return estimatedGalPerMile * milesTraveled;
    }

    // Reports kind of fuel used - regular or diesel
    public String getFuel() {
        return kindOfFuel;
    }

    @Override
    public int axles() {
//        throw new UnsupportedOperationException("");
        return 1;
    }

}