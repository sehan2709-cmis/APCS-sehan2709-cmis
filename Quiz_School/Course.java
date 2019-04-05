import java.util.*;

public class Course
{
    private String courseName;
    private double grade;

    public Course(String courseName, double grade)
    {
        this.courseName = courseName;
        this.grade = grade;
    }
    
    public double getGrade(){
        return grade;
    }
}
