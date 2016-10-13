package exam1;

public class MotorlessVehicle extends Vehicle implements MotorlessInter {

    public MotorlessVehicle(String name) {
        super(name);
    }

    @Override
    public int axles() {
//        throw new UnsupportedOperationException("");
        return 1;
    }

    public String toString() {
        return super.toString() + ": motorless vehicle";
    }

    public double fuelConsumed() {
        return 0.0;
    }

    @Override
    public int hasPedals() {
        return 0;
    }

    @Override
    public int hasHnadlebars() {
        return 0;
    }

    @Override
    public int hasStand() {
        return 0;
    }
}