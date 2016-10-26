package Ch19_Generics;
import java.util.ArrayList;
/**
 * Created by kkang on 10/20/2016.
 */
/**
 * Inheritance does not work with generics
 */
public class Generics_Class_Example {

    public static class Tree{
        @Override
        public String toString(){
            return "Tree Class";
        }
    }

    public static class DutchElm extends Tree{
        @Override
        public String toString() {
            return "DutchElm Class";
        }
    }

    public static void showList(ArrayList<? extends Tree> list){
        for(Object t : list){
            System.out.println(t);
        }
    }


    public static void showList2(ArrayList<? super DutchElm> list){
        for(Object t : list){
            System.out.println(t);
        }
    }

    public static void main(String[] args){
        ArrayList<Tree> myList = new ArrayList<>();
        myList.add(new Tree());
        myList.add(new Tree());

        showList(myList);

        ArrayList<DutchElm> myList1 = new ArrayList<>();
        myList1.add(new DutchElm());
        myList1.add(new DutchElm());

        showList(myList1);
    }
}
//public class Generics_Class_Example {
//    public static void main(String[] args){
//
//        //OLD WAY
//        ArrayList al = new ArrayList();
//        al.add("Apple");
//        al.add("Orange");
//
//        String fruit = (String)al.get(0);
//        System.out.println(fruit);
//
//        //NEW WAY
//        ArrayList<String> al2 = new ArrayList<String>();
//        al2.add("dog");
//        al2.add("cat");
//
//        String animal = al2.get(0);
//        System.out.println(animal);
//
//        //HASHMAP
//        HashMap<Integer, String> map = new HashMap<Integer,String>();
//    }
//}


