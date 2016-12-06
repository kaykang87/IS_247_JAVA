/**
 * Created by kkang on 12/1/2016.
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\tRetriever Records");
        System.out.println("-------------------------");
        System.out.println("\t\t   Menu");
        System.out.println("0. New student record");
        System.out.println("1. Edit student record");
        System.out.println("2. Print student record");
        System.out.println("3. Insert student record");

        System.out.println();
        System.out.println("Enter the menu #: ");

        int userInput = input.nextInt();

        switch (userInput)
        {
            case 0:
                System.out.println("Please enter your name: ");
                input.nextLine();
                String name = input.nextLine();
                System.out.println("Please enter your student ID: ");
                String studentID = input.nextLine();
                System.out.println("Please enter your current standing: ");
                String currentStanding = input.nextLine();
                System.out.println("Please enter your Email: ");
                String email = input.nextLine();
                System.out.println("Please enter your phone number: ");
                String phoneNumber = input.nextLine();
                System.out.println("Please enter your total credits: ");
                int totalCredits = input.nextInt();
                Student student = new Student(name, studentID, currentStanding, email,
                        phoneNumber,totalCredits);
                System.out.println("Your name is: " + student.getName() + ". " + "\nYour student ID is: " + student.getStudentId() + ". " +
                        "\nYour current standing is: " + student.getCurrentStanding() + ". " + "\nYour email is : " +
                        student.getEmail() + ". " + "\nYour phone number is: " + student.getPhoneNumber() + ". " + "\nYour total credits this semester is: " +
                        student.getTotalCredits());
                break;
            case 1:
                System.out.println("Which student would you like to delete? ");
                //stuff
                break;
            case 2:
                System.out.println("Please enter your name: ");
                String nameFile = input.nextLine();
                System.out.println("Please enter your student ID: ");
                Student idFile = new Student();
                Student student1 = new Student();
                System.out.println("Would you like to print your student record to a file? " +
                        "\n Enter 0 to print to a file." + "\n Enter 1 to print to console.");
                int fileInput = input.nextInt();
                if (fileInput == 0) {
                    File f = new File("Student_Record.txt");
                    FileOutputStream fileWriter = new FileOutputStream(f, true);
                    BufferedOutputStream buffer = new BufferedOutputStream(fileWriter);
                    PrintWriter printWriter = new PrintWriter(buffer);
                    if (f.exists() == false) {
                        f.createNewFile();
                    } else {
                        System.out.println("The file already exists");
                    }
                } else if (fileInput == 1){

                }
            case 3:
                System.out.println("Enter your student ID: ");
                //stuff
                break;
            default:
                System.out.println("Please enter the right number.");
                break;
        }

    }
}
