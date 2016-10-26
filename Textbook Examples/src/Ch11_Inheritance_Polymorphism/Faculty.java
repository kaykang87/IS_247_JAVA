package Ch11_Inheritance_Polymorphism;

/**
 * If a class is designed to be extended, it is better to provide
 * a no arg constructor to avoid programming errors.
 */


public class Faculty extends Employee
{
    public static void main(String[] args) {
        new Faculty();
    }

    public Faculty()  //no arg constructor
    {
        System.out.println("(4) Performs Faculty's tasks");
    }
}

class Employee extends Person
{
    public Employee()    //no arg constructor
    {
        this("(2) Invoke Employee's overloaded constructor");
        System.out.println("(3) Performs Employee's tasks ");
    }
    public Employee(String s)
    {
        System.out.println(s);
    }
}

class Person{
    public Person() //no arg constructor
    {
        System.out.println("(1) Perform's Person's tasks");
    }
}
