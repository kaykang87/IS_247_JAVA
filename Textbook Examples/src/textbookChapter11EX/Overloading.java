package textbookChapter11EX;

/**
 * Created by kkang on 9/12/2016.
 */
public class Overloading {
    public static void main(String[] args){
        C c = new C();
        c.p(10);
        c.p(10.0);
    }
}

class D {
    public void p(double i){
        System.out.println(i*2);
    }
}

class C extends D{
    //Overloads the method in B
    public void p(int i){
        System.out.println(i);
    }
}
