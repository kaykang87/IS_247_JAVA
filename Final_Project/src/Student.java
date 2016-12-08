/**
 * Kyong Kang, Malik Arsalan, Zelalem Ashebo, Nicholas Suhku
 * IS247 Group Project
 * Student Class: Has variables and methods pertaining to the student
 */

// Student extends Identification
public class Student extends Identification {

    private String email;
    private String phoneNumber;
    private String classification;
    private int totalCredits;
    private int currentCredits;

    // Default Student constructor
    public Student() {
        this.email = "default@umbc.edu";
        this.classification = "Freshman";
        this.phoneNumber = "3011234567";
        this.totalCredits = 0;
        this.currentCredits = 0;
    }

    // Student constructor to handle new students
    public Student(String firstName, String lastName, String phoneNumber, int totalCredits, int currentCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.totalCredits = totalCredits;
        this.currentCredits = currentCredits;
    }

    // Student constructor with studentID, email, and classification to handle student files already created
    public Student(String firstName, String lastName, String studentId, String email, String phoneNumber,
                   String classification, int totalCredits, int currentCredits) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.classification = classification;
        this.totalCredits = totalCredits;
        this.currentCredits = currentCredits;
    }

    // classification getter
    public String getClassification() {
        return this.classification;
    }

    // classification setter
    public void setClassification(int totalCredits) {
        if (totalCredits < 30) {
            this.classification = "Freshman";
        } else if (totalCredits > 29 && totalCredits < 60) {
            this.classification = "Sophomore";
        } else if (totalCredits > 59 && totalCredits < 90) {
            this.classification = "Junior";
        } else {
            this.classification = "Senior";
        }
    }

    // email getter
    public String getEmail() {
        return this.email;
    }

    // email setter
    public void setEmail(String email) {
        this.email = email;
    }

    // Method to create an email for student using first and last names
    public void createEmail(String firstName, String lastName) {
        char firstLetter = firstName.toLowerCase().charAt(0);
        this.email = firstLetter + lastName.toLowerCase() + "@umbc.edu";
    }

    // phoneNumber getter
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // phoneNumber setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // totalCredits getter
    public int getTotalCredits() {
        return this.totalCredits;
    }

    // totalCredits setter
    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    // Method to add credits to totalCredits
    public void addTotalCredits(int credits) {
        if (totalCredits + credits < 0 ) {
            System.out.println("Total credits cannot be negative, setting to 0");
            this.totalCredits = 0;
        } else {
            this.totalCredits = totalCredits + credits;
        }
    }

    // currentCredits getter
    public int getCurrentCredits() {
        return this.currentCredits;
    }

    // currentCredits setter
    public void setCurrentCredits(int currentCredits) {
        this.currentCredits = currentCredits;
    }

    // Method to add credits to currentCredits
    public void addCurrentCredits(int credits) {
        if (currentCredits + credits < 0) {
            System.out.println("Current credits cannot be negative, setting to 0");
            this.currentCredits = 0;
        } else if ( currentCredits + credits > 18) {
            System.out.println("Current credits cannot exceed 18, setting to 18");
            this.currentCredits = 18;
        } else {
            this.currentCredits = currentCredits + credits;
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return "\nName: " + this.firstName + " " + this.lastName + "\nStudent ID: " + this.studentId + "\nEmail: " +
                this.email + "\nPhone Number: " + this.phoneNumber + "\nClassification: " + this.classification +
                "\nTotal credits: " + this.totalCredits + "\nCurrent credits: " + this.currentCredits;
    }
}
