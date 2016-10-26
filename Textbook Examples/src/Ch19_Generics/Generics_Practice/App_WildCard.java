package Ch19_Generics.Generics_Practice;
import java.util.ArrayList;

/**
 * Created by kyong on 10/24/2016.
 */

class Machine {
    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start(){
        System.out.println("Machine starting.");
    }
}

class Camera extends Machine{                          // Camera is extends machine
    @Override
    public String toString() {
        return "I am a camera";
    }

    public void snap(){
        System.out.println("Camera snaps");
    }
}

public class App_WildCard {

    public static void main(String[] args){
        ArrayList<Machine> list1 = new ArrayList<Machine>();

        list1.add(new Machine());                          // adding return from Machine() method to ArrayList
        list1.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<Camera>();

        list2.add(new Camera());                           // adding return from Camera() method to ArrayList
        list2.add(new Camera());

        showList(list2);                                    // passing list(ArrayList) to showList method
        showList2(list1);
        showList3(list1);
    }

      public static void showList(ArrayList<? extends Machine> list) {       // ? is called the WildCard. Taking in ArrayList of Machine or anything that extends Machine(Camera)
          for (Machine value : list) {                                       // is kind of like setting a lower boundary
              System.out.println(value);
              value.start();
          }
      }
    public static void showList2(ArrayList<? super Camera> list) {       // Taking in ArrayList of anything that is Camera or Super class of Camera(Machine). Setting Upper Boundary
        for(Object value: list){                                        // Object must be the type
            System.out.println(value);
        }
    }
    public static void showList3(ArrayList<?> list) {       // ? is called the WildCard. Taking in ArrayList of unknown class
            for (Object value : list) {                          // list items can be only of Object type because Object is a parent of all
                System.out.println(value);
            }
        }
}
