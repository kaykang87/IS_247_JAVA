package textbookChapter19EX;

/**
 * Created by kkang on 10/20/2016.
*/

public class BoundedTypeDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 2);
        Circle circle = new Circle(2);

        System.out.println("Same area? "
                + equalArea(rectangle, circle));
    }

    public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
        return true;//object1.getArea() == object2.getArea();
    }
}