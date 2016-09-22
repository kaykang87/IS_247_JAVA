package Homework_12_5;
import java.util.Scanner;

/**
 * Created by kkang on 9/22/2016.
 */
public class TriangleHW extends Triangle{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) sides[i] = input.nextDouble();
        System.out.print("Enter a triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));
        Triangle t1 = null;
        try {
            t1 = new Triangle(sides[0], sides[1], sides[2]);
            t1.setColor(color);
            t1.setFilled(isFilled);
            System.out.println("Triangle 1:");
            System.out.println("Area = " + t1.getArea());
            System.out.println("Perimeter = " + t1.getPerimeter());
            System.out.println("Color = " + t1.getColor());
            System.out.println("Is filled? " + t1.isFilled());
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }
}
