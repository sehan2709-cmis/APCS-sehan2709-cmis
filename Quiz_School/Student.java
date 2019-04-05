import java.util.*;

public class Student
{
    private String last;
    private String name;
    private int gradeLevel;
    private List<Course> courses;
    private Course course;
    
    public Student(String last){
        this.last = last;
    }
    
    public Student(String name, int gradeLevel){
        this.name = name;
        this.gradeLevel = gradeLevel;
    }
    
    public void addCourse(Course cours)
    {
        courses.add(cours);
    }
    
    public double getGPA(){
        double calculating = 0;
        for(int grades = 0; grades < courses.size(); grades++)
        {
            Course coursen = courses.get(grades);
            calculating += coursen.getGrade();
        }
        double result = calculating / courses.size();
        return result;
    }
}
