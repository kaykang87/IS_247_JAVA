/**
 * Created by kkang on 12/1/2016.
 */
public class Student {
    private String name;
    private String studentId;
    private String currentStanding;
    private String email;
    private String phoneNumber;
    private int totalCredits;

    public Student() {
        this.name = "defaultName";
        this.studentId = "defaultStudentId";
        this.currentStanding = "defaultCurrentStanding";
        this.email = "defaultEmail";
        this.phoneNumber = "301-123-4567";
        this.totalCredits = 12;
    }

    public Student(String name, String studentId, String currentStanding, String email, String phoneNumber,
                   int totalCredits) {
        this.name = name;
        this.studentId = studentId;
        this.currentStanding = currentStanding;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.totalCredits = totalCredits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCurrentStanding() {
        return currentStanding;
    }

    public void setCurrentStanding(String currentStanding) {
        this.currentStanding = currentStanding;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }
}
