/**
 * Created by kkang on 12/1/2016.
 */
public class Tuition {
    double tuition;
    double balance;

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // method to calculate base tuition (in state vs out of state)

    // method to calculate per credit tuition
    public double calculateTution(boolean inState, int credit) {


        if (inState = true) {
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
}