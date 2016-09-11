package textbookChapter10EX;

/**
 * Created by kkang on 9/10/2016.
 */
public class UseBMIClass
{
    public static void main(String[] args)
    {
        BMI bmi1 = new BMI("KIM Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
        + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is "
        + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
