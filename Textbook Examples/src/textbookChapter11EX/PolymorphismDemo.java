package textbookChapter11EX;

/**
 * Created by kkang on 9/15/2016.
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        System.out.println(g.toString());
        Student s = new Student();
        System.out.println(s);
        Person1 p = new Person1();
        System.out.println(p);
        Object o = new Object();
        System.out.println(o);
    }
}
class GraduateStudent extends Student
{
}
class Student extends Person1 {
    public String toString() {
        return "Student";
    }
}
class Person1 extends Object {
    public String toString() {
        return "Person1";
    }
}
