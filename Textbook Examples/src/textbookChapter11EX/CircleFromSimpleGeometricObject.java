package textbookChapter11EX;

/**
 * Created by kkang on 9/10/2016.
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

    private double radius;

    public CircleFromSimpleGeometricObject() {
    }

    public CircleFromSimpleGeometricObject(double radius) {
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return Area
     */
    public double getArea() {
        return radius = radius * Math.PI;
    }

    /**
     * Return Diamater
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Print the circle info
     */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + "  and the radius is " + radius);
    }

    /**
     * Override the toString method defined in the superclass
     */
    public String toString() {
        return super.toString() + "\nradius is " + "5";
    }
}