/**
 * Created by kkang on 12/1/2016.
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int userInput;

        // do-while loop to return to menu after a certain menu execution
        do {
            System.out.println("\nRetriever Records");
            System.out.println("-------------------------");
            System.out.println("\t\t   Menu");
            System.out.println("0. New student record");
            System.out.println("1. Edit student record");
            System.out.println("2. Print student record");
            System.out.println("3. Insert student record");
            System.out.println("4. Exit");

            System.out.println();
            System.out.println("Enter the menu #: ");
            userInput = input.nextInt();
            switch (userInput) {
                case 0:
                    //Create new student; make an new student by asking the user for student info
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
                            phoneNumber, totalCredits);
                    System.out.println("Your name is: " + student.getName() + ". " + "\nYour student ID is: " + student.getStudentId() + ". " +
                            "\nYour current standing is: " + student.getCurrentStanding() + ". " + "\nYour email is : " +
                            student.getEmail() + ". " + "\nYour phone number is: " + student.getPhoneNumber() + ". " + "\nYour total credits this semester is: " +
                            student.getTotalCredits());
                    break;
                case 1:
                    //ask the user if they want to edit or delete a student record; let them pick a student from an array/list of names
                    System.out.println("0: Edit");
                    System.out.println("1: Delete");
                    int userInputCase1 = input.nextInt();
                    switch (userInputCase1) {
                        case 0:
                            System.out.println("What would you like to edit? ");
                            System.out.println("0: Name");
                            System.out.println("1: Student ID");
                            System.out.println("2: Phone Number");
                            //etc...
                            break;
                        case 1:
                            System.out.println("Which student would you like to delete?");
                            //display an array of the student names for the user to pick from
                            break;
                        default:
                            //stuff
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Please enter your name: ");
                    input.nextLine();
                    String name1 = input.nextLine();
                    System.out.println("Please enter your student ID: ");
                    String studentID1 = input.nextLine();
                    System.out.println("Please enter your current standing: ");
                    String currentStanding1 = input.nextLine();
                    System.out.println("Please enter your Email: ");
                    String email1 = input.nextLine();
                    System.out.println("Please enter your phone number: ");
                    String phoneNumber1 = input.nextLine();
                    System.out.println("Please enter your total credits: ");
                    int totalCredits1 = input.nextInt();
                    Student student1 = new Student(name1, studentID1, currentStanding1, email1,
                            phoneNumber1, totalCredits1);
                    System.out.println("Would you like to print your student record to a file? " +
                            "\n Enter 0 to print to a file." + "\n Enter 1 to print to console.");
                    int fileInput = input.nextInt();
                    if (fileInput == 0) {
                        File f = new File("Student_Record.txt");
                        FileOutputStream fileWriter = new FileOutputStream(f, true);
                        BufferedOutputStream buffer = new BufferedOutputStream(fileWriter);
                        PrintWriter printWriter = new PrintWriter(buffer);
                        printWriter.write("\nYour name is: " + student1.getName() + ". " + "\nYour student ID is: " + student1.getStudentId() + ". " +
                                "\nYour current standing is: " + student1.getCurrentStanding() + ". " + "\nYour email is : " +
                                student1.getEmail() + ". " + "\nYour phone number is: " + student1.getPhoneNumber() + ". " + "\nYour total credits this semester is: " +
                                student1.getTotalCredits());
                        printWriter.close();
                        System.out.println("Your file has been created");
                        } else if (fileInput == 1) {
                        System.out.println("Your name is: " + student1.getName() + ". " + "\nYour student ID is: " + student1.getStudentId() + ". " +
                                "\nYour current standing is: " + student1.getCurrentStanding() + ". " + "\nYour email is : " +
                                student1.getEmail() + ". " + "\nYour phone number is: " + student1.getPhoneNumber() + ". " + "\nYour total credits this semester is: " +
                                student1.getTotalCredits());
                    }
                    break;
                case 3:
                    System.out.println("Enter your student ID: ");
                    //stuff
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter the right number.");
                    break;
            }
        }while (userInput != 4);
    }
}
