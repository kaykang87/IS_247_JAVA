package Ch13_Abstract_Interfaces.Fruit2;

/**
 * Created by kkang on 9/22/2016.
 */
//abstract class can't be instantiated but can be inherited
abstract public class Fruit
{
    int size;

    public void eat() {
        System.out.println("This method is - eat method");
    }
    public abstract void color();
}
