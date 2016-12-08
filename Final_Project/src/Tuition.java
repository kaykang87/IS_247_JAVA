/**
 * Kyong Kang, Malik Arsalan, Zelalem Ashebo, Nicholas Suhku
 * IS247 Group Project
 * Tuition Class: Has variables and methods pertaining to tuition
 */

// Tuition extends Identification
public class Tuition extends Identification {

    private double balance;
    private boolean inState;

    // Default Tuition constructor
    public Tuition() {
        this.balance = 0.0;
        this.inState = true;
    }

    // Tuition constructor for existing and new students
    public Tuition(String firstName, String lastName, double balance, boolean inState) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.inState = inState;
    }

    // balance getter
    public double getBalance() {
        return this.balance;
    }

    // balance setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to calculate balance
    public double calculateBalance(double balance, double money){
        this.balance = balance + money;
        return this.balance;
    }

    // inState getter
    public boolean getInState() {
        return this.inState;
    }

    // inState setter
    public void setInState(boolean inState) {
        this.inState = inState;
    }

    // Method to determine tuition
    public double calculateTuition(boolean inState, int credit) {
        double tuition;

        if (inState) {
            if (credit >= 12) {
                tuition = 5500;
            } else {
                tuition = credit * 300;
            }
        } else {
            if (credit >= 12) {
                tuition = 11000;
            } else {
                tuition = (credit * 300) * 2;
            }
        }

        return tuition;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Balance: " + this.balance + "\nIn State: " + this.inState;
    }

}

