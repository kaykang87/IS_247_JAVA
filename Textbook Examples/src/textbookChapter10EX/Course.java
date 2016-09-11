package textbookChapter10EX;

/**
 * Created by kkang on 9/10/2016.
 */
public class Course
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        //left as an exercise in programming exercise 10.9
    }
}
