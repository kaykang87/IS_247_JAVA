package Ch11_Inheritance_Polymorphism;

/**
 * Created by kkang on 9/12/2016.
 */
public class Overriding
{
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

// This method overrides the method in B
class A extends B {
    public void p(double i) {
        System.out.println(i);
    }
}


