package Homework_12_5;
import java.util.Scanner;

/**
 * Created by kyong kang on 9/21/2016.
 * Homework 1 IS 247.
 * Chapter 12.5
 */
public class TriangleHW extends Triangle
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double[] sides = new double[3];
        for (int i = 0; i < sides.length; i++) sides[i] = input.nextDouble();
        System.out.print("Enter a the color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));
        Triangle triangle1 = null;
        try {
            triangle1 = new Triangle(sides[0], sides[1], sides[2]);
            triangle1.setColor(color);
            triangle1.setFilled(isFilled);
            System.out.println("Triangle 1:");
            System.out.println("Area = " + triangle1.getArea());
            System.out.println("Perimeter = " + triangle1.getPerimeter());
            System.out.println("Color = " + triangle1.getColor());
            System.out.println("Is filled? " + triangle1.isFilled());
        } catch (IllegalTriangleException ex) {
            ex.printStackTrace();
        }
    }
}
