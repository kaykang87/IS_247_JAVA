package exam1;
import java.io.*;

/**
 * Created by kkang on 10/13/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MotorlessVehicle motorlessV = new MotorlessVehicle("Bicycle");
        MotorVehicle motorV = new MotorVehicle("Elantra", 20, "Gas");

        System.out.println(motorlessV.axles());
        System.out.println(motorlessV.toString());
        System.out.println(motorlessV.fuelConsumed());
        System.out.println(motorlessV.hasHnadlebars());
        System.out.println(motorlessV.hasPedals());
        System.out.println(motorlessV.hasStand());

        System.out.println();
        System.out.println(motorV.toString());
        System.out.println(motorV.fuelConsumed());
        System.out.println(motorV.getFuel());
        System.out.println(motorV.axles());
        try {
            File f = new File("output.txt");
            FileOutputStream fileWriter = new FileOutputStream(f, true);
            BufferedOutputStream buffer = new BufferedOutputStream(fileWriter);
            PrintWriter printWriter = new PrintWriter(buffer);
            if (f.exists() == false) {
                f.createNewFile();
            } else {
                System.out.println("The file already exists");
            }
            printWriter.write(motorlessV.axles() + " " + motorlessV.toString() + " "
                    + motorlessV.fuelConsumed() + " " + motorlessV.hasHnadlebars() + " " +
                    motorlessV.hasPedals() + " " + motorlessV.hasStand());
            printWriter.write("\n");
            printWriter.write(motorV.toString() + " " + motorV.fuelConsumed() + " "
                    + motorV.getFuel() + " " + motorV.axles());
            printWriter.close();
        } catch (Exception ex){
            System.out.println("Exception: error");

        }
    }
}
