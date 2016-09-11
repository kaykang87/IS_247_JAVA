package com.company;
import java.util.Scanner;

public class Demo
{
    public Car()
    {
        private String make;
        private int modelYear;
        private String brand;
        private int maxSpeed;
    }

    //default constructor
    public Car()
    {
    }

    public Car(String make, int modelYear, String brand, int maxSpeed)
    {
        this.make = make;
        this.modelYear = modelYear;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    //getters

    public String getmake()
    {
        return make;
    }
    public int getmodelYear()
    {
        return modelYear;
    }
    public String getbrand()
    {
        return brand;
    }
    public int getmaxSpeed()
    {
        return maxSpeed;
    }

    //setters

    public void setmake(String make)
    {
        this.make = make;
    }
    public void setmodelYear(String modelYear)
    {
        this.modelYear = modelYear;
    }
    public void setbrand(String brand)
    {
        this.brand = brand;
    }
    public void setmaxSpeed(String maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args)
    {
        Car car1 = new Car();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter make: ");
        String mymake = Scanner.next();

        System.out.println("Please enter Model Year: ");
        int mymodelYear = scanner.nextInt();

        System.out.println("Please enter brand: ");
        String mybrand = scanner.next();

        System.out.println("Please enter maxSpeed: ");
        int mymaxSpeed = scanner.nextInt();

        car1.setmake(mymake);
        car1.setbrand(mybrand);
        car1.setmodelYear(mymodelYear);
        car1.setmaxSpeed(mymaxSpeed);

        System.out.println(car1.getmake());
        System.out.println(car1.getbrand());
        System.out.println(car1.getmodelYear());
        System.out.println(car1.getmaxSpeed());
    }
}
