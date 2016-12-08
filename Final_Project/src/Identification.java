/**
 * Kyong Kang, Malik Arsalan, Zelalem Ashebo, Nicholas Suhku
 * IS247 Group Project
 * Identification Class: Parent class that serves to hold the key identifiers of students: Name and ID
 */

import java.util.Random;

public class Identification {

    protected String firstName;
    protected String lastName;
    protected String studentId;


    // firstName getter
    public String getFirstName() {
        return this.firstName;
    }

    // firstName setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastName getter
    public String getLastName() {
        return this.lastName;
    }

    // lastName setter
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // studentID getter
    public String getStudentId() {
        return this.studentId;
    }

    // studentID setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Method to create a studentID for student using two letters and five numbers
    public void createStudentID() {
        // Create Random object
        Random rnd = new Random();
        char charOne = (char)(rnd.nextInt(26) + 'a'); // Get first random letter
        char charTwo = (char)(rnd.nextInt(26) + 'a'); // Get second random letter
        int fiveDigits = (10000 + rnd.nextInt(99999)); // Get random five digit number

        // Combine letters and numbers into string for studentID
        this.studentId = Character.toString(charOne).toUpperCase() +
                Character.toString(charTwo).toUpperCase() + fiveDigits;
    }

    // Override toString method
    @Override
    public String toString() {
        return "\nName: " + this.firstName + " " + this.lastName + "\nStudent ID: " + this.studentId;
    }
}
