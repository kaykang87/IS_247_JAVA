package textbookChapter19EX.Generics_Practice;
import java.util.ArrayList;
import java.util.HashMap;

class Animal{

}

public class App_Generics {
    public static void main(String[] args){

        //////////////////// Old Style without Generics ///////////////////////
        ArrayList list = new ArrayList();

        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);         // down casting to String because list.get(1) returns object

        System.out.println(fruit);

        ////////////////// Modern Style with Generics //////////////////////////
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");

        String  animal = strings.get(1);
        System.out.println(animal);

        /////////////// There can be more than one type argument ///////////////
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        /////////////// Java 7 Style  /////////////////////////////////////////
        ArrayList<Animal> someList = new ArrayList<>();        // Letting Java figure out what to put in the list
    }
}