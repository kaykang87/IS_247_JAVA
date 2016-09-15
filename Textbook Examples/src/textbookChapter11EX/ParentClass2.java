package textbookChapter11EX;

/**
 * Using Super Keyword to call the constructor of the parent class
 */

class ParentClass2
{
    ParentClass2(){
        System.out.println("Constructor of Superclass");
    }
}
class Subclass2 extends ParentClass2
{
    Subclass2(){
	/* super() must be added to the first
	 * line of constructor otherwise it would
	 * throw compilation error:
	 * " Constructor call must be the first statement
	 * in a constructor".
	 */
        super();
        System.out.println("Constructor of Subclass");

    }
    void display(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Subclass2 obj= new Subclass2();
        obj.display();
    }
}
