/**
 * Kyong Kang, Malik Arsalan, Zelalem Ashebo, Nicholas Suhku
 * IS247 Group Project
 * GPA Class: Has variables and methods pertaining to GPA
 */

// GPA extends Identification
public class GPA extends Identification {

    private double currentGPA;

    // Default GPA constructor
    public GPA() {
        this.currentGPA = 0.0;
    }

    // GPA constructor for existing and new students
    public GPA(String firstName, String lastName, double currentGPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentGPA = currentGPA;
    }

    // currentGPA getter
    public double getCurrentGPA() {
        return this.currentGPA;
    }

    // currentGPA setter
    public void setCurrentGPA(double currentGPA) {
        this.currentGPA = currentGPA;
    }

    // Method to calculate currentGPA
    public double calculateCurrentGPA(String[] grades) {
        double sum = 0.0;
        double[] gradesArray = new double[grades.length];
        for (int i = 0; i <= grades.length - 1; i++) {
            if (grades[i].equals("A")) {
                gradesArray[i] = 4.0;
            } else if (grades[i].equals("B")) {
                gradesArray[i] = 3.0;
            } else if (grades[i].equals("C")) {
                gradesArray[i] = 2.0;
            } else if (grades[i].equals("D")) {
                gradesArray[i] = 1.0;
            } else {
                gradesArray[i] = 0.0;
            }
        }
        for (double i : gradesArray){
            sum += i;
        }
        return sum / gradesArray.length;


    }

    // Override toString method
    @Override
    public String toString() {
        return "Current GPA: " + this.currentGPA;
    }
}

