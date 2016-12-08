/**
 * Kyong Kang, Malik Arsalan, Zelalem Ashebo, Nicholas Suhku
 * IS247 Group Project
 * Main Class: Pre-loads files upon start of program; has menu that allows user to create, edit, view, delete, and
 * insert new files.
 */

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create scanner object to read user input
        int userInput; // Create userInput variable

        System.out.println("Please enter directory location: "); // Gets directory location for the student files
        String directoryLoc = input.nextLine();

        File folder = new File(directoryLoc); // Get folder than holds files
        File[] lof = folder.listFiles(); // Get an array of the files in the folder

        ArrayList<Student> studentList = new ArrayList<>(); // Create ArrayList of type Student to hold the students
        ArrayList<GPA> gpaList = new ArrayList<>(); // Create ArrayList of type GPA to hold the GPA's of students
        ArrayList<Tuition> tuitionList = new ArrayList<>(); // Create ArrayList of type Tuition to hold the finances of students

        //try-catch block for loading in pre-existing files
        try {
            // for-loop to read files and get stored information
            for (int i = 0; i < lof.length; i++) {
                String temp = lof[i].getName();
                BufferedReader br = new BufferedReader(new FileReader(directoryLoc + temp));
                String str;

                ArrayList<String> tempList = new ArrayList<>();
                while ((str = br.readLine()) != null) {
                    tempList.add(str);
                }
                String[] list = tempList.toArray(new String[tempList.size()]);
                String name[] = list[0].split("\\s+"); // Split the name entry into first and last names
                Student tempStudent = new Student(name[0], name[1], list[1], list[2], list[3], list[4],
                        Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                GPA tempGPA = new GPA(name[0], name[1], Double.parseDouble(list[7]));
                Tuition tempTuition = new Tuition(name[0], name[1], Double.parseDouble(list[8]), Boolean.parseBoolean(list[9]));
                studentList.add(tempStudent);
                gpaList.add(tempGPA);
                tuitionList.add(tempTuition);
                br.close();
            }
        } catch (FileNotFoundException e) {
        System.out.println("Error: " + e); // Display error message for FileNotFoundException
        System.out.println("File was not found or sub-directories exist.");
        System.exit(1);
        } catch (Exception e) {
        System.out.println("Error: " + e); // Display generic error message
        System.exit(1);
    }

        // Begin while loop for menu; user presses 0 to exit
        do {
            // Print menu to console
            System.out.println("\tRetriever Records");
            System.out.println("-------------------------");
            System.out.println("Choose an option:");
            System.out.println("0. Exit");
            System.out.println("1. New student record");
            System.out.println("2. Edit student record");
            System.out.println("3. Display student record");
            System.out.println("4. Upload student record");
            System.out.println("5. Delete student record");

            // try-catch to handle InputMismatchException and IOException
            try {
                userInput = input.nextInt(); // Store user input
                // Switch statement for menu
                switch (userInput) {
                    // Case 0: exits the program
                    case 0:
                        System.out.println("Exiting program...");
                        break;

                    //Case 1: Creates a new student file by asking user for information from console and displays what they entered
                    case 1:
                        System.out.println("Please enter student's first name: "); // Get first name + uppercase
                        String firstName = input.next().toUpperCase();
                        System.out.println("Please enter student's last name: "); // Get last name + uppercase
                        String lastName = input.next().toUpperCase();
                        System.out.println("Please enter student's phone number: "); // Get phone number
                        String phoneNumber = input.next();
                        System.out.println("Please enter student's total credits: "); // Get total credits
                        int totalCredits = input.nextInt();
                        System.out.println("Please enter student's current credit amount: "); // Get current semester credits
                        int currentCredits = input.nextInt();

                        // Checks to make sure that current credits is not less than 0 or greater than max 18
                        if (currentCredits < 0) {
                            System.out.println("Current credits can not be negative. Setting to 0.");
                            currentCredits = 0;
                        } else if (currentCredits > 18) {
                            System.out.println("Current credits can not exceed 18. Setting to 18.");
                            currentCredits = 18;
                        }

                        System.out.println("Please enter student's current GPA: "); // Get current GPA
                        double currentGPA = input.nextDouble();
                        System.out.println("Please enter student's current balance: "); // Get current balance
                        double balance = input.nextDouble();
                        System.out.println("Is the student living in state?\n0. Yes\n1. No");
                        int userAns = input.nextInt();
                        boolean inState;
                        if (userAns == 0) {
                            inState = true;
                        } else {
                            inState = false;
                        }

                        Student newStudent = new Student(firstName, lastName, phoneNumber, totalCredits, currentCredits); // Create student object
                        newStudent.createEmail(firstName, lastName); // Create email
                        newStudent.createStudentID(); // Create student ID
                        newStudent.setClassification(totalCredits); // Determine student class

                        GPA newGPA = new GPA(firstName, lastName, currentGPA); // Create GPA object
                        Tuition newTuition = new Tuition(firstName, lastName, balance, inState);

                        System.out.println("\nYou entered: ");
                        System.out.println(newStudent.toString()); // Call toString method to print out information to console
                        System.out.println(newGPA.toString());
                        System.out.println(newTuition.toString());

                        // Create file object to output to file
                        File newFile = new File(directoryLoc + firstName + lastName + ".txt");
                        FileOutputStream fos = new FileOutputStream(newFile);
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));

                        bw.write(newStudent.getFirstName() + " " + newStudent.getLastName());
                        bw.newLine();
                        bw.write(newStudent.getStudentId());
                        bw.newLine();
                        bw.write(newStudent.getEmail());
                        bw.newLine();
                        bw.write(newStudent.getPhoneNumber());
                        bw.newLine();
                        bw.write(newStudent.getClassification());
                        bw.newLine();
                        bw.write("" + newStudent.getTotalCredits());
                        bw.newLine();
                        bw.write("" + newStudent.getCurrentCredits());
                        bw.newLine();
                        bw.write("" + newGPA.getCurrentGPA());
                        bw.newLine();
                        bw.write("" + newTuition.getBalance());
                        bw.newLine();
                        bw.write("" + newTuition.getInState());
                        bw.close(); // Close file once done

                        studentList.add(newStudent);
                        gpaList.add(newGPA);
                        tuitionList.add(newTuition);

                        System.out.println("\nCreated new record\n");
                        break;

                    // Case 2 handles editing the student records
                    case 2:
                        System.out.println("Choose which student record to edit: ");
                        System.out.println("0: Cancel");
                        // for-loop to display names of students
                        for (int i = 0; i < studentList.size(); i ++) {
                            System.out.println(i + 1 + ": " + studentList.get(i).getFirstName() + " " +
                                    studentList.get(i).getLastName());
                        }
                        int studentChoice = input.nextInt();
                        if (studentChoice == 0) {
                            break;
                        }

                        // do-while loop for menu
                        do {
                            System.out.println("Editing: " + studentList.get(studentChoice - 1).getFirstName() +
                            " " + studentList.get(studentChoice - 1).getLastName());
                            System.out.println("What would you like to edit: ");
                            System.out.println("0. Exit");
                            System.out.println("1. Name");
                            System.out.println("2. Student ID");
                            System.out.println("3. Email");
                            System.out.println("4. Phone Number");
                            System.out.println("5. Total Credits");
                            System.out.println("6. Current Credits");
                            System.out.println("7. Current GPA");
                            System.out.println("8. Finances");

                            int editChoice = input.nextInt();

                            switch (editChoice) {
                                // Case 0: Exit switch statement and loop; saves edits
                                case 0:
                                    System.out.println("Returning to menu...");

                                    //Save edits to file before exiting
                                    File editFile = new File(directoryLoc + studentList.get(studentChoice - 1).getFirstName() +
                                            studentList.get(studentChoice - 1).getLastName() + ".txt");
                                    FileOutputStream editFOS = new FileOutputStream(editFile);
                                    BufferedWriter editBW = new BufferedWriter(new OutputStreamWriter(editFOS));

                                    editBW.write(studentList.get(studentChoice - 1).getFirstName() + " " +
                                            studentList.get(studentChoice - 1).getLastName());
                                    editBW.newLine();
                                    editBW.write(studentList.get(studentChoice - 1).getStudentId());
                                    editBW.newLine();
                                    editBW.write(studentList.get(studentChoice - 1).getEmail());
                                    editBW.newLine();
                                    editBW.write(studentList.get(studentChoice - 1).getPhoneNumber());
                                    editBW.newLine();
                                    editBW.write(studentList.get(studentChoice - 1).getClassification());
                                    editBW.newLine();
                                    editBW.write("" + studentList.get(studentChoice - 1).getTotalCredits());
                                    editBW.newLine();
                                    editBW.write("" + studentList.get(studentChoice - 1).getCurrentCredits());
                                    editBW.newLine();
                                    editBW.write("" + gpaList.get(studentChoice - 1).getCurrentGPA());
                                    editBW.newLine();
                                    editBW.write("" + tuitionList.get(studentChoice - 1).getBalance());
                                    editBW.newLine();
                                    editBW.write("" + tuitionList.get(studentChoice - 1).getInState());
                                    editBW.close(); // Close file once done

                                    studentChoice = 0; // Exit out of do-while loop
                                    break;

                                // Case 1: Edits student's first and last name
                                case 1:

                                    // Delete old file before name change
                                    new File(directoryLoc + studentList.get(studentChoice - 1).getFirstName() +
                                            studentList.get(studentChoice - 1).getLastName() + ".txt").delete();

                                    System.out.println("Previous first name: ");
                                    System.out.println(studentList.get(studentChoice - 1).getFirstName());
                                    System.out.println("Enter new first name: ");
                                    String newFirstName = input.next();
                                    studentList.get(studentChoice - 1).setFirstName(newFirstName.toUpperCase());

                                    System.out.println("Previous last name: ");
                                    System.out.println(studentList.get(studentChoice - 1).getLastName());
                                    System.out.println("Enter new last name: ");
                                    String newLastName = input.next();
                                    studentList.get(studentChoice - 1).setLastName(newLastName.toUpperCase());
                                    break;

                                // Case 2: Edits student's ID
                                case 2:
                                    System.out.println("Previous student ID: ");
                                    System.out.println(studentList.get(studentChoice - 1).getStudentId());
                                    System.out.println("Enter new student ID: ");
                                    String newStudentID = input.next();
                                    studentList.get(studentChoice - 1).setStudentId(newStudentID.toUpperCase());
                                    break;

                                // Case 3: Edits student's email address
                                case 3:
                                    System.out.println("Previous email address: ");
                                    System.out.println(studentList.get(studentChoice - 1).getEmail());
                                    System.out.println("Enter new email address: ");
                                    String newEmail = input.next();
                                    studentList.get(studentChoice - 1).setEmail(newEmail.toLowerCase());
                                    break;

                                // Case 4: Edits student's phone number
                                case 4:
                                    System.out.println("Previous phone number: ");
                                    System.out.println(studentList.get(studentChoice - 1).getPhoneNumber());
                                    System.out.println("Enter new phone number: ");
                                    String newPhoneNumber = input.next();
                                    studentList.get(studentChoice - 1).setPhoneNumber(newPhoneNumber);
                                    break;

                                // Case 5: Edits student's total number of credits; either add or subtract; find class
                                case 5:
                                    System.out.println("Total Credits: " + studentList.get(studentChoice -
                                            1).getTotalCredits());
                                    System.out.println("Choose an option: ");
                                    System.out.println("0: Cancel");
                                    System.out.println("1: Add credits");
                                    System.out.println("2: Subtract credits");
                                    int credChoice = input.nextInt();

                                    if (credChoice == 1) {
                                        System.out.println("Enter amount of credits: ");
                                        int credits = input.nextInt();
                                        if (credits > 0) {
                                            studentList.get(studentChoice - 1).addTotalCredits(credits);
                                            studentList.get(studentChoice - 1).setClassification(
                                                    studentList.get(studentChoice - 1).getTotalCredits());
                                        } else {
                                            System.out.println("Please enter a positive integer value only.");
                                        }
                                    } else if (credChoice == 2) {
                                        System.out.println("Enter amount of credits: ");
                                        int credits = input.nextInt();
                                        if (credits > 0) {
                                            studentList.get(studentChoice - 1).addTotalCredits(credits * -1);
                                            studentList.get(studentChoice - 1).setClassification(
                                                    studentList.get(studentChoice - 1).getTotalCredits());
                                        } else {
                                            System.out.println("Please enter a positive integer value only.");
                                        }
                                    }
                                    break;

                                // Case 6: Edits student's current number of credits; either add or subtract
                                case 6:
                                    System.out.println("Current Credits: " + studentList.get(studentChoice -
                                            1).getCurrentCredits());
                                    System.out.println("Choose an option: ");
                                    System.out.println("0: Cancel");
                                    System.out.println("1: Add credits");
                                    System.out.println("2: Subtract credits");
                                    int currChoice = input.nextInt();

                                    if (currChoice == 1) {
                                        System.out.println("Enter amount of credits: ");
                                        int credits = input.nextInt();
                                        if (credits > 0) {
                                            studentList.get(studentChoice - 1).addCurrentCredits(credits);
                                        } else {
                                            System.out.println("Please enter a positive integer value only.");
                                        }
                                    } else if (currChoice == 2) {
                                        System.out.println("Enter amount of credits: ");
                                        int credits = input.nextInt();
                                        if (credits > 0) {
                                            studentList.get(studentChoice - 1).addCurrentCredits(credits * -1);
                                        } else {
                                            System.out.println("Please enter a positive integer value only.");
                                        }
                                    }
                                    break;

                                // Case 7: Changes current GPA
                                case 7:
                                    // Determine number of classes, based on 3 credits per class
                                    int classes = (studentList.get(studentChoice - 1).getCurrentCredits())/3;
                                    System.out.println("Student is currently taking " + classes + " classes");
                                    String[] tempClassArray = new String[classes];
                                    System.out.println("Please enter letter grade for each class: ");

                                    // for-loop to assign letter grade to each class
                                    for (int i = 0; i < classes; i++) {
                                        System.out.println("Class " + i + ": ");
                                        tempClassArray[i] = input.next().toUpperCase();
                                    }
                                    // Call gpa method to calculate new current gpa
                                    double newCurrGPA = gpaList.get(studentChoice - 1).calculateCurrentGPA(tempClassArray);
                                    gpaList.get(studentChoice - 1).setCurrentGPA(newCurrGPA);
                                    break;

                                // Case 8: Manage student finances
                                case 8:
                                    System.out.print("Balance: ");
                                    System.out.println(tuitionList.get(studentChoice - 1).getBalance());
                                    System.out.println("Choose an option: ");
                                    System.out.println("0: Cancel");
                                    System.out.println("1: Add tuition to balance");
                                    System.out.println("2: Pay off balance");
                                    int finChoice = input.nextInt();

                                    if (finChoice == 1) {
                                        System.out.print("Student tuition is: ");
                                        double cost = tuitionList.get(studentChoice -
                                                1).calculateTuition(tuitionList.get(studentChoice -
                                                1).getInState(), studentList.get(studentChoice -
                                                1).getCurrentCredits());
                                        System.out.println(cost);
                                        System.out.print("New balance is: ");
                                        System.out.println(tuitionList.get(studentChoice -
                                                1).calculateBalance(tuitionList.get(studentChoice -
                                                1).getBalance(), cost));
                                    } else if (finChoice == 2) {
                                        System.out.println("Enter amount to pay off on balance: ");
                                        int pay = input.nextInt();
                                        System.out.print("New balance is: ");
                                        System.out.println(tuitionList.get(studentChoice -
                                                1).calculateBalance(tuitionList.get(studentChoice -
                                                1).getBalance(), (-1 * pay)));

                                    }

                                    break;

                                default:
                                    System.out.println("Error: input does not match menu options. Try again.");
                                    break;
                            }
                        }while (studentChoice != 0);
                        break;

                    // Case 3: Requests user to choose a student to display to console
                    case 3:
                        System.out.println("Choose which student record to display");
                        System.out.println("0. Cancel");
                        // for-loop to display names of students
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.println(i + 1 + ". " + studentList.get(i).getFirstName() + " " +
                                    studentList.get(i).getLastName());
                        }
                        int disChoice = input.nextInt();

                        if ( disChoice != 0) {
                            System.out.println(studentList.get(disChoice - 1).toString());
                            System.out.println(gpaList.get(disChoice - 1).toString());
                            System.out.println(tuitionList.get(disChoice - 1).toString());
                        }
                        break;

                    // Case 4: Requests user to input directory location to upload a file
                    case 4:
                        System.out.println("Please enter record location: ");

                        Scanner newInput = new Scanner(System.in);
                        String recordLoc = newInput.nextLine();

                        File newFolder = new File(recordLoc); // Get folder than holds files
                        File[] newLOF = newFolder.listFiles(); // Get an array of the files in the folder

                        try {
                            for (int i = 0; i < newLOF.length; i++) {
                                String temp = newLOF[i].getName();
                                BufferedReader br2 = new BufferedReader(new FileReader(recordLoc + temp));
                                String str;

                                ArrayList<String> tempList = new ArrayList<>();
                                while ((str = br2.readLine()) != null) {
                                    tempList.add(str);
                                }
                                String[] list = tempList.toArray(new String[tempList.size()]);
                                String name[] = list[0].split("\\s+"); // Split the name entry into first and last names
                                Student tempStudent = new Student(name[0], name[1], list[1], list[2], list[3], list[4],
                                        Integer.parseInt(list[5]), Integer.parseInt(list[6]));
                                GPA tempGPA = new GPA(name[0], name[1], Double.parseDouble(list[7]));
                                Tuition tempTuition = new Tuition(name[0], name[1], Double.parseDouble(list[8]),
                                        Boolean.parseBoolean(list[9]));

                                // Create file object to output to file
                                File tempFile = new File(directoryLoc + name[0] + name[1] + ".txt");
                                FileOutputStream tempFOS = new FileOutputStream(tempFile);
                                BufferedWriter tempBW = new BufferedWriter(new OutputStreamWriter(tempFOS));

                                tempBW.write(tempStudent.getFirstName() + " " + tempStudent.getLastName());
                                tempBW.newLine();
                                tempBW.write(tempStudent.getStudentId());
                                tempBW.newLine();
                                tempBW.write(tempStudent.getEmail());
                                tempBW.newLine();
                                tempBW.write(tempStudent.getPhoneNumber());
                                tempBW.newLine();
                                tempBW.write(tempStudent.getClassification());
                                tempBW.newLine();
                                tempBW.write("" + tempStudent.getTotalCredits());
                                tempBW.newLine();
                                tempBW.write("" + tempStudent.getCurrentCredits());
                                tempBW.newLine();
                                tempBW.write("" + tempGPA.getCurrentGPA());
                                tempBW.newLine();
                                tempBW.write("" + tempTuition.getBalance());
                                tempBW.newLine();
                                tempBW.write("" + tempTuition.getInState());
                                tempBW.close(); // Close file once done

                                studentList.add(tempStudent);
                                gpaList.add(tempGPA);
                                tuitionList.add(tempTuition);

                                br2.close();
                            }
                        } catch (FileNotFoundException e) {
                            System.out.println("Error: " + e); // Display error message for FileNotFoundException
                            System.out.println("File was not found or sub-directories exist.");
                            System.exit(1);
                        } catch (Exception e) {
                            System.out.println("Error: " + e); // Display generic error message
                            System.exit(1);
                        }
                        break;

                    // Case 5: Lets user choose a student record to delete
                    case 5:
                        System.out.println("Choose which student record to delete: ");
                        System.out.println("0: Cancel");
                        // for-loop to display names of students
                        for (int i = 0; i < studentList.size(); i ++) {
                            System.out.println(i + 1 + ": " + studentList.get(i).getFirstName() + " " +
                                    studentList.get(i).getLastName());
                        }

                        int delChoice = input.nextInt(); // Store user choice

                        // If user chooses to delete record, first attempt to delete file, then from array
                        if ( delChoice != 0) {
                            if (new File(directoryLoc + studentList.get(delChoice - 1).getFirstName() +
                                    studentList.get(delChoice - 1).getLastName() + ".txt").delete()) {
                                studentList.remove(delChoice - 1);
                                gpaList.remove(delChoice - 1);
                                tuitionList.remove(delChoice - 1);
                                System.out.println("Record deleted.");
                            } else {
                                System.out.println("Record failed to delete.");
                            }

                        }
                        break;

                    // Default case: display message to handle integers outside of cases
                    default:
                        System.out.println("Error: input does not match menu options. Try again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input: " + e); // Display error message for InputMismatch Exception
                System.exit(1);
                userInput = 0;
            } catch (Exception e) {
                System.out.println("Error: " + e); // Display generic error message
                System.exit(1);
                userInput = 0;
            }
        } while (userInput != 0); // Exit loop when user enters 0
    }
}
